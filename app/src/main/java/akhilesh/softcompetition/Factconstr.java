package akhilesh.softcompetition;
import java.util.Scanner;
class Calculate
        {
            int  n2,c,fact=1;
         Calculate(int n1)
         {
             n2=n1;

         }
            public void fac()
            {
                for(c=1;c<=n2;c++)
                {
                     fact=fact*c ;

                }

                System.out.println("Factorial of the given number " +n2+" is "+fact);
            }
        }
public class Factconstr {
    public static void main(String[] args) {
        int n,c;
        System.out.println("Enter the number");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        Calculate e=new Calculate(n );
    e.fac();
    }




}
