import java.util.Scanner;
public class Calculator {

    public static int getIntFromUser(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    public static int[] getNumbersFromUser(){
        int amount = getIntFromUser("Enter amount of numbers: ");
        int[] numbers = new int[amount];

        for (int i = 0; i < amount; i++) {
            numbers[i] = getIntFromUser("Enter number: ");
        }

        return numbers;
    }

    public static int addNumbers(int ... numbers){
        int accumulator = 0;

        for (int i : numbers) {
            accumulator += i;
        }

        return accumulator;
    }

    public static int subtractNumbers(int ... numbers){
        int accumulator = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            accumulator -= numbers[i];
        }

        return accumulator;
    }

    public static int multiplyNumbers(int ... numbers){
        int accumulator = 1;

        for (int i : numbers) {
            accumulator *= i;
        }

        return accumulator;
    }

    public static int divisionNumbers(int ... numbers){
        int accumulator = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            accumulator /= numbers[i];
        }

        return accumulator;
    }

    public static int calculate(int[] numbers, int operation){

        switch (operation){
            case 1:
                return addNumbers(numbers);
            case 2:
                return subtractNumbers(numbers);
            case 3:
                return multiplyNumbers(numbers);
            case 4:
                return divisionNumbers(numbers);
            default:
                return Integer.MAX_VALUE;
        }

    }

    public static void main (String[]args) {
        int[] numbers = getNumbersFromUser();

        System.out.println( "1 - Sum "       + '\n' +
                            "2 - Subtract "  + '\n' +
                            "3 - Multiply "  + '\n' +
                            "4 - Division "         );

        int operation = getIntFromUser("Enter operation: ");
        int calculationResult = calculate(numbers, operation);
        System.out.println("Your result: " + calculationResult);

    }
}