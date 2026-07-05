package day_02;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int r,sum=0;
        while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print("the sum of the numbers = " +sum);
    }
}
