/**Object.hashCode()
*@author keviness
*@version 2020/10/9
*/

import java.util.*;

public class ObjectHashCode
{
    public static void main(String[] args)
    {
        Person student = new Person("keviness", 27);
        Object o = student;
        System.out.println("The hash code:"+student.hashCode());
        System.out.println("The hash code:"+o.hashCode());

        System.out.println("The name:"+student.name +"\n"+"The age:"+student.age);
        System.out.println(student.getName() +'\n'+ student.getAge());

        Person Bob = new Person("Bob", 12);
        System.out.println("The hash code:"+Bob.hashCode());
    }
}

class Person
{
    protected int age; //in a common package
    protected String name;
    public Person(String name, int age)
    {
        this.age = age;
        this.name = name;
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