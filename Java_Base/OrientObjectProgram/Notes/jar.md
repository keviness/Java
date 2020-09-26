## jar包
### 一，jar包定义
&emsp;jar包实际上就是一个zip格式的压缩文件，而jar包相当于目录。
&emsp;如果我们要执行一个jar包的class，就可以把jar包放到classpath中：`java -cp ./hello.jar abc.xyz.Hello`
&emsp;这样JVM会自动在hello.jar文件里去搜索某个类。

### 二，如何创建jar包？

#### （一）手动创建
&emsp;直接在资源管理器中，找到正确的目录，点击右键，在弹出的快捷菜单中选择“发送到”，“压缩(zipped)文件夹”，就制作了一个zip文件。然后，把后缀从.zip改为.jar，一个jar包就创建成功。
#### （二）jar模块创建
1. `jar -cvf TestDirectory.jar` 将当前目录文件打包
2. `jar -xf TestDirectory.jar`  将jar文件解压在当前目录中
3. `jar -tf TestJar.jar` 在dos命令行中显示文件内容