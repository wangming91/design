package com.wangming.pattern.behavior.command;

import com.google.common.collect.Collections2;

import java.util.Stack;

/**
 * @Author: ming.wang
 * @Date: 2019/3/11 17:26
 * @Description:
 */
public class CommandManager {

    private Stack<ICommand> redoStacks = new Stack<>();
    private Stack<ICommand> undoStacks = new Stack<>();

    public void excute(ICommand iCommand) {
        iCommand.excute();
        undoStacks.push(iCommand);
        if (!redoStacks.isEmpty()) {
            redoStacks.clear();
        }
    }

    public void uodo() {
        if (!undoStacks.isEmpty()) {
            ICommand pop = undoStacks.pop();
            pop.uodo();
            redoStacks.push(pop);
        }
    }

    public void redo() {
        if (!redoStacks.isEmpty()) {
            ICommand pop = redoStacks.pop();
            pop.excute();
        }
    }

}
