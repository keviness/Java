## 接口（Interface）
### 接口定义
&emsp;表示一个接口类型和一组方法签名，而编程接口泛指接口规范，如方法签名，数据格式，网络协议等。

### 抽象类与接口的区别
|  Items   |abstract class | interface |
|:--------:|:-----:|:---------:|
|  继承	   | 只能extends一个class | 可以implements多个interface |
|  字段	   | 可以定义实例字段 | 不能定义实例字段 |
|  抽象方法 | 可以定义抽象方法	| 可以定义抽象方法 |
|  非抽象方法 |	可以定义非抽象方法 | 可以定义default方法 |

### 接口继承
&emsp;一个interface可以继承自另一个interface。interface继承自interface使用extends，它相当于扩展了接口的方法
~~~java
interface Hello {
    void hello();
}

interface Person extends Hello {
    void run();
    String getName();
}
~~~
&emsp;此时，Person接口继承自Hello接口，因此，Person接口现在实际上有3个抽象方法签名，其中一个来自继承的Hello接口。

### 继承关系
1. 在使用的时候，实例化的对象永远只能是某个具体的子类，但总是通过接口去引用它，因为接口比抽象类更抽象。
2. 接口允许多继承，一个子接口可以有多个父接口。
3. 接口和抽象类一样，不允许实例化。可定义一个接口引用变量，指向其实现对象，从而实现多态的目的。
~~~java
List list = new ArrayList(); // 用List接口引用具体子类的实例
Collection coll = list; // 向上转型为Collection接口
Iterable it = coll; // 向上转型为Iterable接口
~~~