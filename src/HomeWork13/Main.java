package HomeWork13;
/*
1. Вернемся к домашнему заданию занятия номер 12 и модифицируем его.
Программа должна получать имена файлов с номерами документов с консоли: каждая новая строка - это путь к файлу и имя файла.
Для завершения ввода списка файлов следует ввести 0.
После получения списка документов программа должна обработать каждый документ: вычитать из файла номера документов и провалидировать их.
В конце работы создать один файл отчет с выходной информаций: номер документа - комментарий(валиден или не валиден и по какой причине).
Пусть каждый файл содержит каждый номер документа с новой строки и в строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum(далее любая последовательность букв/цифр) или kontract(далее любая последовательность букв/цифр).
 */

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the file: ");
        FileInputStream setStreame = null;
        StringBuilder readDocFile = new StringBuilder();
        ArrayList<String> wayFile = new ArrayList<String>();
        String path;
        do {
            path = scanner.nextLine();
            if (!path.equals("0")) {
                wayFile.add(path);
            }
        } while (!path.equals("0"));

        for (String wayFileNew : wayFile) {
            System.out.println(wayFileNew);

        }
        for (int i = 0; i < wayFile.size(); i++) {

            try {
                setStreame = new FileInputStream(wayFile.get(i));
                int a = -1;
                while ((a = setStreame.read()) != -1) {
                    readDocFile.append((char) a);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    setStreame.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(readDocFile);

            System.out.println("HashSet");
            HashSet<String> objectInDocFile = new HashSet<String>();
            String a = readDocFile.toString();
            String[] b = a.split("\\r?\\n|\\r");
            objectInDocFile.addAll(List.of(b));
            System.out.println("Вывод HashSet: " + objectInDocFile);

            System.out.println("HashMap");
            Map<String, String> map1 = new HashMap<>();
            for (String key : objectInDocFile) {
                map1.put(key, String.valueOf(isValidDocumNamber(key)));
            }
            String filePath = "MyDoc.txt";
            try(BufferedWriter writerFile = new BufferedWriter( new FileWriter(filePath))){
                for (Map.Entry<String, String> newMap : map1.entrySet()) {
                    writerFile.write(newMap.getKey() + " : " + newMap.getValue());
                    writerFile.newLine();
                    System.out.println(newMap.getKey() + " : " + newMap.getValue());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private static boolean isValidDocumNamber(String documNamber) {
        return (documNamber != null && (documNamber.startsWith("docnum")
                || documNamber.startsWith("contract"))
                && documNamber.length() == 15);
    }
}

