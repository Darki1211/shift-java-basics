package homework201;

import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String originalString = scanner.nextLine();

        System.out.println("Введите символ для поиска:");
        String symbolString = scanner.nextLine();

        if (symbolString.length() != 1) {
            System.out.println("Необходимо ввести один символ");
        } else {
            char searchSymbol = symbolString.charAt(0);

            if (searchSymbol == ' ') {
                System.out.println("Пробел нельзя указывать в качестве символа для поиска");
            } else {
                String stringWithoutExtraSpaces = removeExtraSpaces(originalString);
                String changedString = replaceSymbolWithSpace(stringWithoutExtraSpaces, searchSymbol);
                changedString = removeExtraSpaces(changedString);

                if (originalString.equals(changedString)) {
                    System.out.println("Строка после преобразований не изменилась");
                } else {
                    String result = "Исходная строка: " + originalString + "\n"
                            + "Получившаяся строка: " + changedString;

                    System.out.println(result);
                }
            }
        }
    }

    public static String removeExtraSpaces(String text) {
        text = text.trim();

        StringBuilder result = new StringBuilder();
        boolean previousCharacterIsSpace = false;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter == ' ') {
                if (!previousCharacterIsSpace) {
                    result.append(currentCharacter);
                    previousCharacterIsSpace = true;
                }
            } else {
                result.append(currentCharacter);
                previousCharacterIsSpace = false;
            }
        }

        return result.toString();
    }

    public static String replaceSymbolWithSpace(String text, char searchSymbol) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter == searchSymbol) {
                result.append(' ');
            } else {
                result.append(currentCharacter);
            }
        }

        return result.toString();
    }
}