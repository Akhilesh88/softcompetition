package akhilesh.softcompetition;

import java.util.Scanner;

abstract class A
{
    int n=5;
    /*abstract method */
    abstract void factorial();
    void factor()
    {
        System.out.println("This is a method");
    }
}
    class B extends A {
        void factorial()
        {
            int fact=1;
            Scanner in=new Scanner(System.in);
            n=in.nextInt();                             //taking input from the user
            for (int c = 1; c<=n; c++ )                         //for loop intialization,conditional,incremention
            {
                fact=fact*c;

            }
            System.out.println("Factorial of the number " +n+ "  is ="+fact); //Display the factorial

        }
    }
public class Factabstract {
    public static void main(String[] args) {



            B obj = new B();
            obj.factorial();
            obj.factor();

    }
}
