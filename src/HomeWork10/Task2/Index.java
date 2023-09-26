package HomeWork10.Task2;

public class Index {
    public static void main(String[] args) {
        String input = "6969-abc-2023-Kmv-1a2b ";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.println("Индекс " + i + ": " + character);
        }
    }
}

