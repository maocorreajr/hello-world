import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

class Computer_AI {
    static int Questions() {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        char userChoice = sc.next().charAt(0);
        int rand_int1, rand_int2;
        difficultyList();
        if (userChoice == '1') {
            System.out.println("Enter your choice: ");
            char difficultyLevel = sc.next().charAt(0);
            if (difficultyLevel == '1') {
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                return rand_int1 + rand_int2;
            } else if (difficultyLevel == '2') {
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                return rand_int1 + rand_int2;
            } else if (difficultyLevel == '3') {
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                return rand_int1 + rand_int2;
            } else if (difficultyLevel == '4') {
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                return rand_int1 + rand_int2;
            }
        }
        if (userChoice == '2') {
            System.out.println("Enter your choice: ");
            char difficultyLevel2 = sc.next().charAt(0);
            switch (difficultyLevel2) {
                case '1':
                    rand_int1 = rand.nextInt(10);
                    rand_int2 = rand.nextInt(10);
                    System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                    return rand_int1 - rand_int2;
                case '2':
                    rand_int1 = rand.nextInt(100);
                    rand_int2 = rand.nextInt(100);
                    System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                    return rand_int1 - rand_int2;
                case '3':
                    rand_int1 = rand.nextInt(1000);
                    rand_int2 = rand.nextInt(1000);
                    System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                    return rand_int1 - rand_int2;
                case '4':
                    rand_int1 = rand.nextInt(10000);
                    rand_int2 = rand.nextInt(10000);
                    System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                    return rand_int1 - rand_int2;
            }
        }
        if (userChoice == '3') {
            System.out.println("Enter your choice: ");
            char difficultyLevel3 = sc.next().charAt(0);
            switch (difficultyLevel3) {
                case '1':
                    rand_int1 = rand.nextInt(10);
                    rand_int2 = rand.nextInt(10);
                    System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                    return rand_int1 * rand_int2;
                case '2':
                    rand_int1 = rand.nextInt(100);
                    rand_int2 = rand.nextInt(100);
                    System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                    return rand_int1 * rand_int2;
                case '3':
                    rand_int1 = rand.nextInt(1000);
                    rand_int2 = rand.nextInt(1000);
                    System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                    return rand_int1 * rand_int2;
                case '4':
                    rand_int1 = rand.nextInt(10000);
                    rand_int2 = rand.nextInt(10000);
                    System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                    return rand_int1 * rand_int2;
            }
        }
        if (userChoice == '4') {
            System.out.println("Enter your choice: ");
            char difficultyLevel4 = sc.next().charAt(0);
            switch (difficultyLevel4) {
                case '1':
                    rand_int1 = rand.nextInt(10);
                    rand_int2 = rand.nextInt(10) + 1;
                    System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                    return rand_int1 / rand_int2;
                case '2':
                    rand_int1 = rand.nextInt(100);
                    rand_int2 = rand.nextInt(100) + 1;
                    System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                    return rand_int1 / rand_int2;
                case '3':
                    rand_int1 = rand.nextInt(1000);
                    rand_int2 = rand.nextInt(1000) + 1;
                    System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                    return rand_int1 / rand_int2;
                case '4':
                    rand_int1 = rand.nextInt(10000);
                    rand_int2 = rand.nextInt(10000) + 1;
                    System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                    return rand_int1 / rand_int2;
            }
        }
        if (userChoice == '5') {

            return 1;
        }
        return 0;
    }


    static void displayMenu() {
        System.out.println(" ===================================");
        System.out.println("|\tComputer Assisted instruction\t|");
        System.out.println(" ===================================");
        System.out.println("What would you like to study?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. A random mixture of all four");
        System.out.println("Enter your choice: ");
    }

    static void wrong() {
        Random rand = new Random();
        int wrong_response = rand.nextInt(4) + 1;
        switch (wrong_response) {
            case 1:
                System.out.println("No. Please try again.");
                break;

            case 2:
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don’t give up!");
                break;

            case 4:
                System.out.println("No. Keep trying.");
                break;
        }

    }

    static void right() {
        Random random = new Random();
        int right_response = random.nextInt(4) + 1;
        switch (right_response) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }

    }

    private static void difficultyList() {
        System.out.println("Difficulty level:");
        System.out.print("1. Single Digits");
        System.out.print(" 2. Double Digits");
        System.out.print(" 3. Triple Digits");
        System.out.println("4. Quadruple Digits");
    }
}

class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer_AI.displayMenu();
        int num, userNum;
        char c = 'y';
        while (true) {
            double right = 0, wrong = 0;
            while ((right + wrong) < 10) {
                num = Computer_AI.Questions();
                userNum = sc.nextInt();
                if (userNum == num) {
                    Computer_AI.right();
                    right++;

                } else {
                    Computer_AI.wrong();
                    wrong++;
                }
                if ((right / 10) * 100 >= 75) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                }
            }
        }
    }
}


