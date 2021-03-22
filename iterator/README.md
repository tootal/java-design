# Iterator（迭代器）模式

**把遍历分离出来**

原始代码（用数组管理书本）位于array文件夹中。

BookShelf换用`java.util.Vector`实现代码位于vector文件夹中。

将`Main.java`中的`import iterator.array.*;`改成`import iterator.vector.*;`即可切换内部实现。

可以看出，如果要更改书架的内部实现（数据结构），只需要更改BookShelf类和BookShelfIterator类即可。

这就是迭代器模式的作用，将内部结构进行分离，提供统一的接口进行访问。
