import java.util.*;

public class calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        System.out.println("Which operation you want to do?");
        System.out.println("1-Summation");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Divition");
        System.out.println("5-Modulation");
        System.out.print("Select: ");

        int button = sc.nextInt();

        int sum = (a + b);
        int sub = (a - b);
        int multi = (a * b);
        int div = (a / b);
        int mod = (a % b);

        switch (button){
            case 1:
                System.out.println("Ans: "+sum);
                break;
            case 2:
                System.out.println("Ans: "+sub);
                break;
            case 3:System.out.println("Ans: "+multi);
                break;
            case 4:
                System.out.println("Ans: "+div);
                break;
            case 5:
                System.out.println("Ans: "+mod);
                break;
            default:
                System.out.println("Error!!");
        }
    }
}