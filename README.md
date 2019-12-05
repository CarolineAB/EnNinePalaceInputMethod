# EnNinePalaceInputMethod
类九宫格输入法

![test原文]
https://github.com/CarolineAB/currencyConverter/blob/master/images/%E4%B9%9D%E5%AE%AB%E6%A0%BC%E8%BE%93%E5%85%A5%E9%97%AE%E9%A2%98%E6%8F%8F%E8%BF%B0.jpg
 

运行并测试的步骤:

1.将项目克隆到本地，进入项目目录，并运行命令窗口

运行：“mvn package”


3.命令窗口进入target 目录 cd target

运行 "java -jar EnNinePalaceInputMethod-0.0.1-SNAPSHOT.jar"

![结果输出]https://github.com/CarolineAB/currencyConverter/blob/master/images/%E4%B9%9D%E8%BC%B8.jpg

异常说明:

1.非法数据，提示 “输入数据中，存在非法数据！请输入0-99之间的数据”

2.未输入/操作频繁 提示“请输入数字！”

设计说明：
1.该test为一个类似于九宫格输入的测试，考虑到更贴近输入法，输入数据无需间隔开

原文要求 ”the program need to support converting the digits from 0 to 99 in letters“因此当前仅支持两位数的转换

并将特殊按键设计为“0，1，00，11”等数据为原样输出

2.该test基于spring boot ，依赖maven环境,coding实现作为监听加入到spring容器中，启动main方法即可运行项目

![junit 测试结果]https://github.com/CarolineAB/currencyConverter/blob/master/images/9junit.jpg

