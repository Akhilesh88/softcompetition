package akhilesh.softcompetition;

public class Inttochar
{
    public static void main(String[] args)
    {
        System.out.println(" Q.37 Can you store string in array of integers. Try it.");

        String str="I am Akash";
        int arr[]=new int[str.length()];
        char chArr[]=str.toCharArray();
        char  ch;
        for(int i=0;i<str.length();i++)
        {

            arr[i]=chArr[i];
        }
        System.out.println("\nI have stored it in array by using ASCII value");
        for(int i=0;i<arr.length;i++)
        {

            System.out.print(" "+arr[i]);
        }
        System.out.println("\nI have stored it in array by using ASCII value to original content");
        for(int i=0;i<arr.length;i++)
        {
            ch=(char)arr[i];

            System.out.print(" "+ch);
        }
    }
}
