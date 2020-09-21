/**Inherit example: Student manage
*@author keviness.top
*@version 2020/9/21
*/

import java.util.*;

public class InheritStudentManage
{
    public static void main(String[] args)
    {
        Student kevin = new Student("kevin", 18, "GZUCM", 90, 10);
        kevin.ShowInfo();
        Person lucy = new Student("Lucy", 20, "JXUCM", 80, 19);
        lucy.ShowInfo();
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

    public String GetName()
    {
        return this.name;
    }

    public int GetAge()
    {
        return this.age;
    }

    public void ShowInfo()
    {
        System.out.println("The name:"+this.name+"\nThe age:"+this.age);
    }
}

class Student extends Person
{
    private String school;
    private double score;
    private int grade;

    public Student(String name, int age, String school, double score, int grade)
    {
        super(name, age);
        this.school = school;
        this.score = score;
        this.grade = grade;
    }

    public void ShowInfo()
    {
        System.out.println("The name:"+this.name+'\n'+
                           "The age:"+this.age+'\n'+
                           "The school:"+this.school+'\n'+
                           "The score:"+this.score+'\n'+
                           "The grade:"+this.grade);
    }
}

