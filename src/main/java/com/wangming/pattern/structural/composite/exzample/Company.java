package com.wangming.pattern.structural.composite.exzample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 15:39
 * @Description: 相当于容器构件
 */
@Getter
@Setter
@ToString
public class Company extends AbstractOrganization {

    private String name;
    private List<AbstractOrganization> organizations=new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    @Override
    public int countEmp() {
        int result=0;
        for (int i = 0; i < organizations.size(); i++) {
            result+=organizations.get(i).countEmp();
        }
        return result;
    }

    @Override
    public void add(AbstractOrganization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(AbstractOrganization organization) {
        organizations.remove(organization);
    }
}
