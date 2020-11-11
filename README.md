## Java
&emsp;这是一份Java自学记录。
&emsp;特此感谢[廖雪峰老师](https://www.liaoxuefeng.com/wiki/1252599548343744)的Java教程，[郝斌老师](https://www.bilibili.com/video/BV1ps411F7Sn?from=search&seid=16056465509220656410)和[动力节点](https://www.bilibili.com/video/BV1Rx411876f?p=684)的教学视频。

### Java基本程序设计结构
| Index |  Description   | Code | Notes |
|:-----:|:--------------:|:----:|:-----:|
| 1     | 程序，数据和计算| [MathClass](./Java_Base/BaseProgramStruct/MathClass.java)| [MathClass](./Java_Base/BaseProgramStruct/Notes/MathClass.md)|
| 2     | 数组操作:二维数组 | [Array](./Java_Base/BaseProgramStruct/Array.java)| [Array](./Java_Base/BaseProgramStruct/Array.md)|
| 3     | 字符串操作:剪切子串| [String](./Java_Base/BaseProgramStruct/ExtractSubstrings.java)|[String](./Java_Base/BaseProgramStruct/String.md)|

### Java控制结构
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | while循环   | [while](./Java_Base/ControlStruct/exampleWhile.java)|
|   2   | for循环     | [for](./Java_Base/ControlStruct/exampleFor.java)|
|   3   | 数组        | [Array](./Java_Base/ControlStruct/exampleArray.java)|
|   4   | 二维数组    | [2DArray](./Java_Base/ControlStruct/example2Darray.java)|
|   5   | 输入输出    | [IO](./Java_Base/ControlStruct/exampleInput.java)|

### Java面向对象编程
| Index | Description | Code |  Note |
|:-----:|:-----------:|:----:|:-----:|
|   1   |  构造函数（constructor）| [constructor](./Java_Base/OrientObjectProgram/Constructor.java) |
|   2   |  静态域与静态方法（static field） | [StaticField](./Java_Base/OrientObjectProgram/StaticCounts.java) |
|   3   |  构造静态对象（static object） | [StaticObject](./Java_Base/OrientObjectProgram/StaticConstructSelf.java) |
|   4   |   继承（inherited）1:薪水管理系统实现| [Salary Manage](./Java_Base/OrientObjectProgram/InheritSalaryManage/) |
|   5   |   继承（inherited）2:学生系统实现|  [Student Manage](./Java_Base/OrientObjectProgram/InheritStudentManage.java)|
|   6   |   多态（polymorphic）| [polymorphic](./Java_Base/OrientObjectProgram/Polymorphic.java)|
|   7   |   抽象类（abstract）| [Abstract](./Java_Base/OrientObjectProgram/Abstract.java)|
|   8   |   接口（Interface）  | [Interface](./Java_Base/OrientObjectProgram/Interface.java)| [Interface](./Java_Base/OrientObjectProgram/Notes/Interface.md)|
|   9   |   包（package）|  [Interface](./Java_Base/OrientObjectProgram/Interface.java)| [Package](./Java_Base/OrientObjectProgram/Notes/package.md) |

---

### Java进阶

#### 异常（Exception）
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | 捕获异常（catch exception）| [Catch Exception](./Java_Enhance/ExceptionCatch/TryCatch.java) |
|   2   | 常见异常1（Divide Exception）| [Divide Exception](./Java_Enhance/ExceptionCatch/DivideException.java) |
|   3   | 常见异常2（IO Exception）| [IO Exception](./Java_Enhance/ExceptionCatch/IOException.java)|
|   3   | 自定义异常(1):Override Exception| [Override Exception](./Java_Enhance/ExceptionHandle/ExceptionOverride.java)|
|   4   | 自定义异常(2):Throws Exception| [Throws Exception](./Java_Enhance/ExceptionHandle/ThrowException.java)|
|   5   | 自定义异常(3):Extends Exception| [Extends Exception](./Java_Enhance/ExceptionHandle/ExceptionExtends.java) |

#### 核心类（Main-Class）

##### String Object
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   |String常用方法|  [String methods ](./Java_Enhance/Object/StringObject/StringTest.java) |
|   2   | StringBuffer| [String Buffer](./Java_Enhance/Object/StringObject/StringBufferTest.java)|
|   3   | StringJoiner| [String Joiner](./Java_Enhance/Object/StringObject/StringJoinerTest.java)|

##### Array Object
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   |    copyOf   | [Array copyOf](./Java_Enhance/Object/ArrayObject/ArrayCopyOf.java) |
|   2   |  数组应用实例：随机数组| [Array GetRandomNuber](./Java_Enhance/Object/ArrayObject/GetRandomNumber.java)|
|   3   |  数组存储示例：引用数据数组 | [Array ObjectArray](./Java_Enhance/Object/ArrayObject/ArrayPolymorphic.java)|
|   4   |   二维数组  | [Array NdArray](./Java_Enhance/Object/ArrayObject/ndArray.java) |

##### Date Object
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | java Date Object | [Java Data](./Java_Enhance/Object/DateObject/DateObject.java) |

##### Random Object
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | Random Object| [Java RandomObject](./Java_Enhance/Object/RandomObject/RandomObject.java) |

##### Record Object and Enumerate Object
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   |record object| [Record Object](./Java_Enhance/Object/RecordObject/recordObject.java) |
|   2   |Anonymous Inner class| [Anonymous Inner class](./Java_Enhance/Object/RandomObject/AnonymousInnerClass.java)|
|   3   | Hash Code | [Record Object](./Java_Enhance/Object/RecordObject/recordObject.java) |

##### Math class
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | BigIntegerClass | [BigInteger Class](./Java_Enhance/Object/OtherObject/BigIntegerClass.java) |
|   2   | BigDecimalClass | [BigDecimal Class](./Java_Enhance/Object/OtherObject/BigDecimalClass.java)|

##### Collection
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | Collection: List| [Collection: List](./Java_Enhance/Collection/CollectionList.java) |
|   2   | Collection: Map | [Collection: Map](./Java_Enhance/Collection/CollectionMap.java) |
|   3   | Collection: TreeMap| [Collection: TreeMap](./Java_Enhance/Collection/CollectionTreeMap.java) |
|   4   | Collection: EnumerateMap| [Collection: EnumerateMap](./Java_Enhance/Collection/CollectionEnumerateMap.java)|
|   5   | Collection: Set| [Collection: Set](./Java_Enhance/Collection/CollectionSet.java) |
|   6   | Collection: Queue| [Collection: Queue](./Java_Enhance/Collection/CollectionQueue.java)|
|   7   | Collection: Dequeue| [Collection: Dequeue](./Java_Enhance/Collection/Dequeue.java) |
|   8   | Collection: Properties | [Collection: Properties](./Java_Enhance/Collection/Properties.java) |

##### Reflection
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   | reflection-class |[reflection-class](./Java_Enhance/Reflection/ReflectionClass.java) |
|   2   | reflection-field | [reflection-field](./Java_Enhance/Reflection/ReflectionField.java)|
|   3   | reflection-method| [reflection-method](./Java_Enhance/Reflection/ReflectionMethod.java)|
|   4   | reflection-proxy | [reflection-proxy](./Java_Enhance/Reflection/ReflectionProxy.java)|
|   5   | reflection-inherit| [reflection-inherit](./Java_Enhance/Reflection/ReflectionInherit.java) |

##### Generic 
| Index | Description | Code |
|:-----:|:-----------:|:----:|
|   1   |  generic-interface | [generic-interface](./Java_Enhance/Generic/GenericInterface.java)|