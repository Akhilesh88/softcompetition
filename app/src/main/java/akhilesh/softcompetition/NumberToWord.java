package akhilesh.softcompetition;

import java.util.Scanner;

public class NumberToWord {


        public void pw(int n,String ch )

        {

            String one[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};



            if (n<10)
            {
                System.out.print(one[n/10]+" "+ one[n%10]);
            }
            else{
                System.out.print(one[n]);
            }
            if (n>0)
            {
                System.out.print(ch);
            }
        }


        public static void main(String[] args) {
            int n=0;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter any integer number:");
            n=s.nextInt();
            if (n<=0)
                System.out.print("Enter number greater than zero");
            else
            {
                NumberToWord a =new NumberToWord();
                System.out.print("After the conversion number in words is : ");
                a.pw((n%100),"");
            }


        }
    }

