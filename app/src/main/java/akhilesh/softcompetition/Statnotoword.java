package akhilesh.softcompetition;

import java.util.Scanner;

public class Statnotoword {





        public void pw(int n,String ch )

        {

            String one[] = {"", "one"};



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

    static int n=1;
        public static void main(String[] args) {



                Statnotoword a =new Statnotoword();
                System.out.print("After the conversion number in words is : ");
                a.pw((n%100),"");



        }
    }



