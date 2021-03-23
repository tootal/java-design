# Prototype（原型）模式

有意思的是Cloneable这个接口是一个空的接口，不需要实现clone方法。

```java
public interface Cloneable {
}
```


> 由于 Object 本身没有实现 Cloneable 接口，所以不重写 clone 方法并且进行调用的话会发生 CloneNotSupportedException 异常。

TODO