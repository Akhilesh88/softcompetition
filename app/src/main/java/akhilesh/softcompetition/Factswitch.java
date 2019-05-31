package akhilesh.softcompetition;

import java.util.Scanner;

public class Factswitch {
    public static void main(String[] args) {
        int c,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");    //taking input from the user
        int n=sc.nextInt();
        System.out.println("Enter any operation");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:

                for (c=1;c<=n;c++ )                         //for loop intialization,conditional,incremention
                {
                    fact=fact*c;

                }
                System.out.println("Factorial of the number " +n+ "  is ="+fact); //Display the factorial

        }
    }
}
