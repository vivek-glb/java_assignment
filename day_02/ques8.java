import java.util.Scanner;
public class ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int original=n;
        int rem,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev)
        System.out.print("yes the number is palindrome");
        else
        System.out.print("no the number is not palindrome");    
    }
}