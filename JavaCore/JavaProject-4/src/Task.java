import java.util.Scanner;

public class Task {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //TASK MIN va MAX number sortirovka qiish qilish. ORDER ASC
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3: ");
        int num3 = scanner.nextInt();

        int min = num1;
        if (min > num2) min = num2;
        if (min > num3) min = num3;

        int max = num1;
        if (max < num2) max = num2;
        if (max < num3) max = num3;

        int middleNumber = 0;
        if (num1 < num2 && num2 < num3) middleNumber = num2;
        if (num2 < num1 && num1 < num3) middleNumber = num1;


        System.out.println("--------------------------------------------------");
        System.out.println("Min number: " + min);
        System.out.println("Middle number: " + middleNumber);
        System.out.println("Max number: " + max);
        System.out.println("Sorted numbers: " + min + " , " + middleNumber + " , " + max);
        System.out.println("--------------------------------------------------");

    }
}