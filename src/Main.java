import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int correctNum = 3;
        int divide = 2;
        do {
            System.out.println("Enter number");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.print(1);
        num--;
        while (num>0) {
            while (correctNum % divide != 0) {
                if (divide < correctNum - 1) {
                    divide++;
                }
                if (divide == correctNum - 1) {
                    System.out.print("," + correctNum);
                    num--;
                    correctNum++;
                    divide = 2;
                }
            }
            if (correctNum % divide == 0) {
                correctNum++;
                divide = 2;
            }

        }
    }
}