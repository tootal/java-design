# Factory Method（工厂方法）模式

**将父类分离出来**

```java
Factory factory = new IDCardFactory();
Product card1 = factory.create("小明");
Product card2 = factory.create("小红");
Product card3 = factory.create("小刚");
card1.use();
card2.use();
card3.use();
```

在测试程序中，不需要导入IDCard包就创建出了IDCard的实例。

虽然工厂方法和模板方法看上去很像，貌似都是将处理流程分离了出来。但工厂方法更重要的目的是将父类分离出来。或许模板方法中的豆浆机的例子更适合这里。总之就是，工厂方法模式是模板方法模式的典型应用。

