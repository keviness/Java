## 一，classpath
> classpath是JVM用到的一个环境变量，它用来指示JVM如何搜索class。
### （一）classpath原理
1. 因为Java是编译型语言，源码文件是.java，而编译后的.class文件才是真正可以被JVM执行的字节码。
2. JVM需要知道，如果要加载一个abc.xyz.Hello的类，应该去哪搜索对应的Hello.class文件。
3. classpath就是一组目录的集合，它设置的搜索路径与操作系统相关。例如，在Windows系统上，用;分隔，带空格的目录用""括起来，可能长这样：
~~~html
C:\work\project1\bin;C:\shared;"D:\My Documents\project1\bin"
~~~
### （二）classpath查找顺序
&emsp;假设classpath是.;C:\work\project1\bin;C:\shared，当JVM在加载abc.xyz.Hello这个类时，会依次查找：

* <当前目录>\abc\xyz\Hello.class
* C:\work\project1\bin\abc\xyz\Hello.class
* C:\shared\abc\xyz\Hello.class

&emsp;如果JVM在某个路径下找到了对应的class文件，就不再往后继续搜索。如果所有路径下都没有找到，就报错。

### （三）classpath的设定方法
>* 在系统环境变量中设置classpath，那样会污染整个系统环境,不推荐。

>* 在启动JVM时设置classpath变量，实际上就是给java命令传入-classpath或-cp参数，推荐。

### （四）设置classpath示例
1. java -classpath .;C:\work\project1\bin;C:\shared abc.xyz.Hello
2. 使用-cp的简写：java -cp .;C:\work\project1\bin;C:\shared abc.xyz.Hello

### （五）注意事项
&emsp;没有设置系统环境变量，也没有传入-cp参数，那么JVM默认的classpath为，即当前目录：java abc.xyz.Hello。JVM只在当前目录搜索Hello.class。
