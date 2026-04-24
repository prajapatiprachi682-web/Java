import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehla number dijiye: ");
        int num1 = sc.nextInt();

        System.out.print("Doosra number dijiye: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Dono numbers ka sum = " + sum);

        sc.close();
    }
}