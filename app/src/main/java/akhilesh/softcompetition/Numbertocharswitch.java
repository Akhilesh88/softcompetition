/*package akhilesh.softcompetition;

import java.util.Scanner;
public class Numbertochar {


    public void pw(int n,String ch ) {

        String one[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


        if (n < 10) {
            System.out.print(one[n / 10] + " " + one[n % 10]);
        }
        else {
            System.out.print(one[n]);
        }
        if (n > 0)
        {
            System.out.print(ch);
        }
    }

public class Numbertocharswitch
{
    public void main(String[] args)
    {
        int n=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any integer number:");
        n=s.nextInt();
        System.out.println("Enter any operation");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:

                if (n<=0)
                    System.out.print("Enter number greater than zero");
                else
                {
                    Numbertocharswitch a =new Numbertocharswitch();
                    System.out.print("After the conversion number in words is : ");
                    a.pw((n%100),"");
                }


        }
     }

    }
}

*/