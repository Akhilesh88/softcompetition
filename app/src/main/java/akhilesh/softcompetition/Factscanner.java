package akhilesh.softcompetition;
import java.util.Scanner;
public class Factscanner {
    public static void main(String[] args) {
        int n,c,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the number");
        n=sc.nextInt();
        for(c=1;c<=n;c++){
            fact=fact*c;
        }
        System.out.println("Factorial of the number "+n+ " is = " +fact);

    }
}
