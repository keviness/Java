/**
*The constructors
*@author keviness
*@version 2020/9/15
*/

import java.util.*;

public class Constructor
{
    public static void main(String[] args)
    {
        int age = 18;
        String name = "Bob";
        //Person student = new Person(name, age);
        //Person student = new Person(name);
        Person student = new Person();
        System.out.println("The name:"+student.getName());
        System.out.println("The age:"+student.getAge());
    }
}

class Person
{
    private int age;
    private String name;

    public Person(String name, int age)
    {
        this.age = age;
        this.name = name;
    }
    public Person(String name)
    {
        this(name, 20);
    }
    public Person()
    {
        this("kevin");
    }

    public String getName()
    {
        //showInfo();
        return this.name; 
    }
    public int getAge()
    {
        //showInfo();
        return this.age;
    }
    private void showInfo()
    {
        System.out.printf("The name:%s, and the age:%d \n", this.name, this.age);
    }
}