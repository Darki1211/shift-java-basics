package homework19;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("> Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.printf("> Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.printf("> Введите шаг: ");
        int step = scanner.nextInt();

        printMultiplicationTable(firstNumber, secondNumber, step);
    }

    public static void printMultiplicationTable(int firstNumber, int secondNumber, int step) {
        if (step == 0) {
            System.out.println("Шаг не может быть равен 0");
        } else {
            if (step < 0) {
                step = -step;
            }

            if (firstNumber > secondNumber) {
                int temporary = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temporary;
            }

            System.out.printf("%8s", "");

            int column = firstNumber;
            while (column <= secondNumber) {
                System.out.printf("%8d", column);
                column = column + step;
            }

            if (column - step != secondNumber) {
                System.out.printf("%8d", secondNumber);
            }

            System.out.println();

            int row = firstNumber;
            while (row <= secondNumber) {
                printRow(row, firstNumber, secondNumber, step);
                row = row + step;
            }

            if (row - step != secondNumber) {
                printRow(secondNumber, firstNumber, secondNumber, step);
            }
        }
    }

    public static void printRow(int rowValue, int firstNumber, int secondNumber, int step) {
        System.out.printf("%8d", rowValue);

        int column = firstNumber;
        while (column <= secondNumber) {
            System.out.printf("%8d", rowValue * column);
            column = column + step;
        }

        if (column - step != secondNumber) {
            System.out.printf("%8d", rowValue * secondNumber);
        }

        System.out.println();
    }
}