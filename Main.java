import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        Random rand = new Random();
        int questionsCorrect = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Question " + i + ":");
            int num_1 = rand.nextInt(100);
            int num_2 = rand.nextInt(100);
            int operation = 0 + (int)(Math.random() * (2 + 1));
            System.out.println(operation);
            String operation_text = "";
            int answer = 0;
            switch (operation) {
                case 0:
                    answer = num_1 + num_2;
                    operation_text = " + ";
                    break;
                case 1:
                    answer = num_1 - num_2;
                    operation_text = " - ";
                    break;
                case 2:
                    answer = num_1 * num_2;
                    operation_text = " x ";
                    break;
            }
            System.out.println("What is " + num_1 + operation_text + num_2 + " ?\n");
            int guess = input.nextInt();
            if (guess == answer) {
                System.out.println("Correct\n");
                questionsCorrect++;
            } else {
                System.out.println("Incorrect\n");
            }
        }
        if (questionsCorrect == 5) {
            System.out.println("You're smarter than a 5th grader!\n");
        }
    }
}
