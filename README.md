# EnNinePalaceInputMethod
类九宫格输入法
https://github.com/CarolineAB/currencyConverter/blob/master/images/%E4%B9%9D%E5%AE%AB%E6%A0%BC%E8%BE%93%E5%85%A5%E9%97%AE%E9%A2%98%E6%8F%8F%E8%BF%B0.jpg
 本项目依赖maven环境

运行并测试的步骤:

1.将项目克隆到本地，进入项目目录，并运行命令窗口

运行：“mvn package”


3.命令窗口进入target 目录 cd target

运行 "java -jar EnNinePalaceInputMethod-0.0.1-SNAPSHOT.jar"


异常说明:
1.非法数据，提示 “输入数据中，存在非法数据！请输入0-99之间的数据”

2.未输入/操作频繁 提示“请输入数字！”

3.“0，1，00，11”等数据为原样输出
