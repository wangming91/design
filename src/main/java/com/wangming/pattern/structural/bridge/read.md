#桥接模式

##提出需求
- 初始需求
小米手机有个MP3功能，可播放
- 需求变更
添加了一个华为手机，同样拥有MP3功能，可播放
- 需求再变更
两个手机品牌都需要再增加一个游戏的功能
- 需求再再变更
需要再增加若干个手机品牌以及若干个功能

##需求分析
上述需求在真实案例中是很有可能发生的。代码需要根据需求的变更及时进行重构。我们先分析初始需求，这个需求很简单，可直接建一个小米手机类，添加MP3播放方法即可。

当接收“需求变更”后，我们可能会想到建立一个手机抽象类，并添加MP3播放的抽象方法，然后建立小米和华为手机的类，继承这个手机抽象类并实现它里面的MP3播放方法。

当接收“需求再变更”后，可能由于偷懒，不想重构，我们也只需要进行小小的改动也能满足需求。就是在手机抽象类中加一个游戏方法，并在两个实现类中进行实现。

截止到目前，我们v1版本完成

但是，客户是不会这么温柔的，在二期项目中，客户又提出了需求，目前由于业务未知，可能会增加若干手机品牌和若干功能。这下傻眼了，总不能一直去改抽象类和具体实现类吧。那么此时重构已成为必然。我们v2版本闪亮登场。