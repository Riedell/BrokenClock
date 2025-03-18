# BrokenClock
Repairing a "Broken Clock": Exploring Alibaba's Open-Source Sandbox and JVM Internals.

背景来自阿里开源的JVM Sandbox，这是对官方示例程序：“修复坏钟”的练习。  
下载地址：https://ompc.oss.aliyuncs.com/jvm-sandbox/release/sandbox-stable-bin.zip  
官方仓库地址：https://github.com/alibaba/jvm-sandbox  
官方WIKI地址：https://github.com/alibaba/jvm-sandbox/wiki

- demo-x.x.x分支：存放demo程序；
- repair-x.x.x分支：存放修复程序。

# 流程
> 打开两个shell命令行端/窗口。

1. 下载并安装sandbox压缩包。  
```
unzip sandbox-stable-bin.zip 
```
这是sandbox的项目结构：

![image](https://github.com/user-attachments/assets/222f8a6a-abd4-4cad-8cf5-84d352b214f2)

2. 启动demo程序。可以看到程序每隔10s打印一次报错信息：

![image](https://github.com/user-attachments/assets/2ceed403-35be-44f9-8b2e-4a633f2738d3)

3. 将修复模块打包放到当前用户目录下的.sandbox-module/：

![image](https://github.com/user-attachments/assets/144be4bd-fa6c-40d0-a309-99eadd6c9f27)


4. 在sandbox的bin目录下启动沙箱并查看模块：

![image](https://github.com/user-attachments/assets/94d006d6-5d26-41c9-bffa-818a7eb8f0c2)

现在让sandbox去执行我们的修复程序，触发broken-clock-tinker模块的repairCheckState()方法，让我们的修复逻辑生效。  
现在可以看到“时钟”被成功修复了，开始每隔10s打印一次时间：

![image](https://github.com/user-attachments/assets/ba985af5-c7c2-42b8-a2f6-c48e6f8b1c88)

5. 卸载沙箱模块。。。

# 总结

通过这个简单的流程，我们可以感受到该工具的强大：我们向正在运行的程序中动态地插入了自己新增的业务逻辑。  
工具的本质是通过JVM底层的原理去获取程序在JVM中注册的信息。我们可以通过sandbox工具或直接使用JVM底层方法去查看、篡改java程序的方法入参、返回值、抛出的异常等。  
使用类似原理的工具还有BTRACE、ARTHAS等等。











