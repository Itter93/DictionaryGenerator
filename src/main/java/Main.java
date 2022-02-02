import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String someText = scanner.nextLine();

        //Ниже  используются Stream API для реализации монад

        List<String> dictionary = Arrays.asList(someText.split(" ")).stream().sorted().distinct().toList();
        dictionary.forEach(System.out::println);

    }
}
