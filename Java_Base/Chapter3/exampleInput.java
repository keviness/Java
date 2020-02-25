import java.util.*;
/**
 * The Input and Output in Java
 * @author kevin
 * @version 2020/2/25
 */
public class exampleInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! what\'s your name:");
        String name = in.nextLine();
        System.out.println("hello "+name);
        System.out.print("How old are you:");
        int age = in.nextInt();
        System.out.printf("you are %d", age);
    }
} 