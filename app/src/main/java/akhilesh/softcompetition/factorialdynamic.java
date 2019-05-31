package akhilesh.softcompetition;

import java.util.Scanner;

public class factorialdynamic {
    public static void main(String[] args) {
        int n,c,fact=1;                         //declartion of variable
        System.out.println("Enter the number ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();                             //taking input from the user
        for (c=1;c<=n;c++ )                         //for loop intialization,conditional,incremention
        {
            fact=fact*c;

        }
        System.out.println("Factorial of the number " +n+ "  is ="+fact); //Display the factorial

    }
}
