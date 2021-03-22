# Singleton（单例）模式

**确保只有一个实例**

单例模式没什么好说的，在很多场景下只能有一个实例，否则多个实例之间容易干扰出现问题。

## 多例模式

写了一下后面的扩展题，遇到了一个问题，三个实例的时候总是提示为null。

```java
package singleton;

public class Triple {
    private static Triple[] inst = new Triple[3];
    public static Triple getInstance(int id) {
        if (id >= 0 && id <= 2) return inst[id];
        else return null;
    }
    private Triple() {
        System.out.println("创建了一个Triple实例");
    }
    public void use() {
        System.out.println("使用了一个Triple实例");
    }
    public static void main(String[] args) {
        Triple t0 = Triple.getInstance(0);
        Triple t1 = Triple.getInstance(1);
        Triple t2 = Triple.getInstance(2);
        t0.use();
        t1.use();
        t2.use();
    }
}

```

看了好久都没发现错误，后来才知道：Java中的对象数组需要单独一个个进行初始化，否则创建出来都是null的。

> 在创建后，基本数据类型数组可以直接对数组元素赋值、引用等操作；而自定义对象数组，需要对数组中的每个对象元素独立进行创建，然后才可以对其赋值、引用等操作，如果没有单独对每个对象元素创建，会导致空指针异常

一种方法是利用初始化列表（暂且这么叫）：

```java
private static Triple[] inst = new Triple[] {
    new Triple(),
    new Triple(),
    new Triple()
};
```

这很显然有问题的，有很多个静态实例需要创建怎么办？难道一个一个写出来？

尝试用静态代码段初始化：（以50个为例）

```java
private static Singleton50[] inst = new Singleton50[50];
static {
    for (int i = 0; i < 50; i++) {
        inst[i] = new Singleton50(i);
    }
}
```

测试了上面这种方法是可行的，就是不知道有没有更标准的方法。

## 懒汉模式

书上给的代码其实是“饿汉模式”，就是说除了保证只有一个以外，它还隐含了“始终会有一个”实例。如果完全没有用到这个实例的话，那么这部分内存空间就被浪费了。

懒汉模式就是在需要时再去创建，适合于实例占用内存大，使用场景少的情况。

```java
private static FakeSingleton inst = null;
public static FakeSingleton getInst() {
    if (inst == null) {
        inst = new FakeSingleton();
    }
    return inst;
}
```

在用“懒汉模式”实现单例的时候非常容易出问题，多个线程并发调用getInst可能会创建多个实例。

具体会出什么问题呢？参考FakeSingletonTest代码，结果：

```
生成了一个实例
生成了一个实例
生成了一个实例
singleton.FakeSingleton@1eeb8b19
singleton.FakeSingleton@2e6ffe66
singleton.FakeSingleton@26332b7b
```

所以还需要加锁。

```java
private static FakeSingleton inst = null;
public static synchronized FakeSingleton getInst() {
    if (inst == null) {
        inst = new FakeSingleton();
    }
    return inst;
}
```

改成这样就可以了。

```
生成了一个实例
singleton.FakeSingleton@1eeb8b19
singleton.FakeSingleton@1eeb8b19
singleton.FakeSingleton@1eeb8b19
```

## 双检锁

标记为同步方法（synchronized）其实是有性能上的损耗的。

因此就有了双重校验锁的写法，尝试兼顾性能与安全。

```java
private static DoubleCheckedSingleton inst = null;
public static DoubleCheckedSingleton getInst() {
    if (inst == null) {
        synchronized (DoubleCheckedSingleton.class) {
            if (inst == null) {
                inst = new DoubleCheckedSingleton();
            }
        }
    }
    return inst;
}
```

看上去很美好，然而这带来了更深层次的问题……

TODO

