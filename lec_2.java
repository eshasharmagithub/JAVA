package keerthi;
import java.util.*;
public class lec_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add;
        int sub;

        String name = sc.next();
        System.out.println("enter the name" + name);

        int age = sc.nextInt();
        System.out.println("enter the age" + age);

        System.out.println("enter the two nos to be added");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int result=a+b;

        System.out.println("the result is" +result);
        int result_2=a-b;
        System.out.println("the subtraction of the nos"+result_2);

        float e;
        float f;
        e=sc.nextFloat();
        f=sc.nextFloat();
        float result_3=e*f;
        System.out.println("the multiplication result"+ result_3);








    }
}
