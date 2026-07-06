import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,fact=1;
        System.out.print("Enter n: ");
         n = sc.nextInt();
        for(i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.print("factorial is " + fact);
        sc.close();
    }
}
