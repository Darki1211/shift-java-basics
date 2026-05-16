package homework202;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MultiplicationTableToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите шаг:");
        int step = scanner.nextInt();

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

            String table = createMultiplicationTable(firstNumber, secondNumber, step);
            writeToFile(table, "multiplication_table.txt");

            System.out.println("Таблица умножения записана в файл multiplication_table.txt");
        }
    }

    public static String createMultiplicationTable(int firstNumber, int secondNumber, int step) {
        StringBuilder table = new StringBuilder();

        table.append(String.format("%8s", ""));

        int column = firstNumber;
        while (column <= secondNumber) {
            table.append(String.format("%8d", column));
            column = column + step;
        }

        if (column - step != secondNumber) {
            table.append(String.format("%8d", secondNumber));
        }

        table.append("\n");

        int row = firstNumber;
        while (row <= secondNumber) {
            table.append(createRow(row, firstNumber, secondNumber, step));
            row = row + step;
        }

        if (row - step != secondNumber) {
            table.append(createRow(secondNumber, firstNumber, secondNumber, step));
        }

        return table.toString();
    }

    public static String createRow(int rowValue, int firstNumber, int secondNumber, int step) {
        StringBuilder row = new StringBuilder();

        row.append(String.format("%8d", rowValue));

        int column = firstNumber;
        while (column <= secondNumber) {
            row.append(String.format("%8d", rowValue * column));
            column = column + step;
        }

        if (column - step != secondNumber) {
            row.append(String.format("%8d", rowValue * secondNumber));
        }

        row.append("\n");

        return row.toString();
    }

    public static void writeToFile(String text, String fileName) {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(fileName);

            for (int i = 0; i < text.length(); i++) {
                fileOutputStream.write(text.charAt(i));
            }
        } catch (IOException exception) {
            System.out.println("Ошибка при записи в файл");
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException exception) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}