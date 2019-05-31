

import java.util.Scanner;

public class Ncr {
    static int fact(int m){
        int f=1;
        for(int i=1;i<=m;i++)
        {
            f=f*i;
        }
        return f;
    }


    public static void main(String[] args) {
        int n,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n ");
        n=scan.nextInt();
        System.out.println("Enter r ");
        r=scan.nextInt();
        int nfact=fact(n);
        int rfact=fact(r);
        int n_rfact=fact(n-r);
                int result=nfact/(rfact*n_rfact);
    }
}
