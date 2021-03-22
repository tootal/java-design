# Adapter（适配器）模式——继承



```java
Print p = new PrintBanner("Hello");
p.printWeak();
p.printStrong();
```

PrintBanner是一个适配器，它实现了Print接口，提供了printWeak和printStrong方法。

但它具体是如何实现的，外界不需要知道。实际上它是对已有的Banner类进行了一个包装。

将原有的功能适配到了新的需求下。