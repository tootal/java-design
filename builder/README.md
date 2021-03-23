# Builder（建造者）模式

原始代码有些特殊符号不好输入，就改成构建Markdown和HTML文档了，均使用文件输出。

另外就是这个需要在命令行运行，所以不能直接用vscode的直接运行了。

顺便熟悉一下编译命令。

参考一下自带的运行命令：

```
c:; cd 'c:\Users\tootal\Documents\Projects\java-design'; & 'c:\Users\tootal\.vscode\extensions\vscjava.vscode-java-debug-0.32.1\scripts\launcher.bat' 'C:\Users\tootal\scoop\apps\zulufx15\current\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' 
'-Dfile.encoding=UTF-8' '-cp' 'C:\Users\tootal\AppData\Roaming\Code\User\workspaceStorage\040e76875d0e00316cf1470cb588f1b4\redhat.java\jdt_ws\java-design_f80f1110\bin' 'builder.Main' 
```

算了，不搞命令行参数了，直接在代码里面测试了。


