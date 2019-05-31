package akhilesh.softcompetition;

public class factorialstatic {
   static int n=5,c,fact=1; //static variable diclaration
    public static void main(String[] args) {

        for(c=1;c<=n;c++ ) //for loop intialization , condition,incremment
        {
            fact=fact*c;     //fact variable stores the multpilication of intailized fact with c variable

        }
        System.out.println("Factorial of the " +n+ " Number is = "+fact);  //Display on the  screen  the  result of fact
    }
}
