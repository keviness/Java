/**
*Inherit example: extends key word
*@author keviness
*@version 2020/9/16
*/

import java.util.*;

public class Inherited
{
    public static void main(String[] args)
    {
        Student kevin = new Student("kevin", 18, 9, 79);
        //kevin.ShowStudentInfo();
        System.out.println("The name:"+kevin.getName());
    }
}

class Person 
{
    protected String name;
    protected int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void ShowInfo()
    {
        System.out.printf("The name:%s \n The age:%d \n", this.name, this.age);
    }
}

class Student extends Person
{
    private int grade;
    private int score;

    public Student(String name, int age, int grade, int score)
    {
        super(name, age);
        this.grade = grade;
        this.score = score;
    }

    public void ShowStudentInfo()
    {
        //super.ShowInfo();
        //ShowInfo();
        this.ShowInfo();
        System.out.printf("The grade:%d \n The score:%d \n", this.grade, this.score);
    }

    public String getName()
    {
        //return this.name;
        //return name;
        return super.name;
    }
}