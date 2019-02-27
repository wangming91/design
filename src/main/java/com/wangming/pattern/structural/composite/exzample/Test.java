package com.wangming.pattern.structural.composite.exzample;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 15:50
 * @Description:  组合模式：实现统计一个集团公司的总人数。已知该集团组织架构如下
 */
public class Test {
    public static void main(String[] args) {
        AbstractOrganization 总公司 = new Company("总公司");
        AbstractOrganization 华北公司 = new Company("华北公司");
        AbstractOrganization 财务部_华北公司=new Department("财务部_华北公司",1);
        AbstractOrganization 研发部_华北公司=new Department("研发部_华北公司",2);
        AbstractOrganization 销售部_华北公司=new Department("销售部_华北公司",3);

        AbstractOrganization 华南公司 = new Company("华南公司");
        AbstractOrganization 财务部_华南公司=new Department("财务部_华南公司",4);
        AbstractOrganization 研发部_华南公司=new Department("研发部_华南公司",5);
        AbstractOrganization 销售部_华南公司=new Department("销售部_华南公司",6);

        AbstractOrganization 华中公司 = new Company("华中公司");
        AbstractOrganization 财务部_华中公司=new Department("财务部_华中公司",7);
        AbstractOrganization 研发部_华中公司=new Department("研发部_华中公司",8);
        AbstractOrganization 销售部_华中公司=new Department("销售部_华中公司",9);

        AbstractOrganization 华东公司 = new Company("华东公司");
        AbstractOrganization 财务部_华东公司=new Department("财务部_华东公司",10);
        AbstractOrganization 研发部_华东公司=new Department("研发部_华东公司",11);
        AbstractOrganization 销售部_华东公司=new Department("销售部_华东公司",12);

        华北公司.add(财务部_华北公司);
        华北公司.add(研发部_华北公司);
        华北公司.add(销售部_华北公司);

        华南公司.add(财务部_华南公司);
        华南公司.add(研发部_华南公司);
        华南公司.add(销售部_华南公司);

        华中公司.add(财务部_华中公司);
        华中公司.add(研发部_华中公司);
        华中公司.add(销售部_华中公司);

        华东公司.add(财务部_华东公司);
        华东公司.add(研发部_华东公司);
        华东公司.add(销售部_华东公司);

        总公司.add(华北公司);
        总公司.add(华南公司);
        总公司.add(华中公司);
        总公司.add(华东公司);

        System.out.println("总人数:"+总公司.countEmp());

    }
}
