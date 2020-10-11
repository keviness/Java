/**Array polymorphic example
*@author keviness
*@version 2020/10/11
*/

import java.util.*;

public class ArrayPolymorphic
{
    public static void main(String[] args)
    {
        Animals[] anis = new Animals[5];
        anis[0] = new Bird("Bob");
        anis[1] = new Cat("Lucy");
        anis[2] = new Dog("Nancy");
        anis[3] = new Bird("Ketty");
        anis[4] = new Dog("Daiv");

        for (Animals ani : anis)
        {
            ani.showName();
            if (ani instanceof Bird)
            {
                //ani.sing();
                Bird bird = (Bird)ani;
                bird.sing();
            }
            else if (ani instanceof Cat)
            {
                //ani.climb();
                Cat cat = (Cat)ani;
                cat.climb();
            }
            else
            {
                //ani.bark();
                Dog dog = (Dog)ani;
                dog.bark();
            }
        }
    }
}

abstract class Animals
{
    String name;
    public Animals(String name)
    {
        this.name  = name;
    }

    public void showName()
    {
        System.out.println("The name: "+this.name);
    }

    //public void sing(){};
    //public void bark(){};
    //public void climb(){};
}

class Bird extends Animals
{
    public Bird(String name)
    {
        super(name);
    }
    public void showName()
    {
        System.out.println("Hello, I am a bird, my name is: "+this.name);
    }

    public void sing()
    {
        System.out.println("Bird Sing: Today is a nice day!");
    }
}

class Cat extends Animals
{
    public Cat(String name)
    {
        super(name);
    }

    public void showName()
    {
        System.out.println("Hello, I am a cat, my name is: "+this.name);
    }

    public void climb()
    {
        System.out.println("The cat is climeing the tree...");
    }
}

class Dog extends Animals
{
    public Dog(String name)
    {
        super(name);
    }

    public void showName()
    {
        System.out.println("Hello, I am a dog, my name is: "+this.name);
    }

    public void bark()
    {
        System.out.println("The dog is barking....");
    }
}
