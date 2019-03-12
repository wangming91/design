package com.wangming.pattern.behavior.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: ming.wang
 * @Date: 2019/3/11 17:23
 * @Description:
 */
@Getter
@Setter
@ToString
public class InsertIntoCommand implements ICommand {

    private SQLExcute sqlExcute;

    private String id;

    public InsertIntoCommand(SQLExcute sqlExcute, String id) {
        this.sqlExcute = sqlExcute;
        this.id = id;
    }

    @Override
    public void uodo() {
        sqlExcute.delete(id);
    }

    @Override
    public void excute() {
        sqlExcute.insertInto(id);
    }
}
