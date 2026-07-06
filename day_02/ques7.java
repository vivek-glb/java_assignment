import java.util.Scanner;
public class ques7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int rem,pro=1;
        while(n!=0){
            rem=n%10;
            pro=pro*rem;
            n=n/10;
        }
        System.out.print("the product of the numbers = " +pro);
    }
}