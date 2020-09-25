/**Interface example
*@author keviness
*@version 2020/9/23
*/
package InterfaceTest;

import java.util.*;

public class Interface
{
    public static void main(String[] args)
    {
        Person kevin = new Student("kevin", 20);
        System.out.println("The name:"+kevin.getName());
        System.out.println("The age:"+kevin.getAge());
        System.out.println("The grade:"+kevin.grade);
    }
}

interface Person 
{
    int grade = 8;
    //grade = 1;
    public String getName();
    public int getAge();
}

class Student implements Person
{
    public String name;
    public int age;
    //grade = 10;
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}