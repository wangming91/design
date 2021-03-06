#适配器模式
##定义与类型
- 定义: 将一个类的接口转变成用户期望的接口，使原本不兼容的类可以一起工作
- 类型: 结构型

##适用场景
- 已经存在的类，他的方法和需求不匹配时(方法结果相同或相似)
- 不是软件设计阶段考虑的设计模式，是随着软件的维护，由于不同产品、不同厂家造成功能类似而接口不同情况下的解决方案


##优点
- 能提高类的透明性和复用，现有的类复用但不需要改变
- 目标类和适配器类解耦，提高程序的扩展性
- 符合开闭原则

##缺点
- 适配器编写过程需要全面考虑，可能会增加系统的复杂性
- 增加代码可读性的难度

##扩展
- 对象适配器（组合）
- 类适配器（继承）

##源码阅读
-  