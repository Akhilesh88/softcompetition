package akhilesh.softcompetition;

import java.util.Scanner;

public class factfunction {
    public static void fact(int n) {
        int c,fact=1;
        for(c=1;c<=n;c++)
        {
            fact=fact*c;

        }
        System.out.println("The factorial of "+n+  " no is ="+fact);
}

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number  ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        fact(n);
    }
}
