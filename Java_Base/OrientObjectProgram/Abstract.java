/**Abstract example
*@author keviness
*@version 2020/9/24
*/

import java.util.*;

public class Abstract
{
    public static void main(String[] args)
    {
        Person kevin = new Student("Kevin", 20, 7, 80);
        System.out.println("The name:"+kevin.getName());
        System.out.println("The age:"+kevin.getAge());
        Student nancy = new Student("Nancy", 19, 8, 90);
        nancy.showInfo();
        System.out.println("The grade:"+nancy.getGrade());
        System.out.println("The score:"+nancy.getScore());
    }
}

abstract class Person
{
    public static String name;
    public static int age;

    abstract public  String getName();
    abstract public  int getAge();
    public static void showInfo()
    {
        System.out.println("Person");
    }
}

class Student extends Person
{
    public static int grade;
    public static double score;

    public Student(String name, int age, int grade, double score)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public static int getGrade()
    {
        return grade;
    }

    public static double getScore()
    {
        return score;
    }
}

