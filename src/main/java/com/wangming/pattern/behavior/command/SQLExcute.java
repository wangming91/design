package com.wangming.pattern.behavior.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: ming.wang
 * @Date: 2019/3/12 9:52
 * @Description:
 */
@Getter
@Setter
@ToString
public class SQLExcute {

    public void insertInto(String id) {
        System.out.println("插入一条数据，id:" + id);
    }

    public void delete(String id) {
        System.out.println("删除一条数据，id:" + id);
    }
}
