package HomeWork12;
/*
Допустим есть txt файл с номерами документов. Номером документа является строка, состоящая из букв и цифр(без служебных символов).
Пусть этот файл содержит каждый номер документа с новой строки и в строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum(далее любая последовательность букв/цифр) или contract(далее любая последовательность букв/цифр).
Написать программу для чтения информации из входного файла - путь к входному файлу должен задаваться через консоль.
Программа должна проверять номера документов на валидность.
 */

import javax.print.Doc;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//C:\Users\kotova-mv\Desktop\JavaHW\Docnum.txt
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the file: ");
        File file = new File(scanner.nextLine());
        boolean fileEx = file.exists();
        System.out.println("Give me " + file.getPath() + "exists " + fileEx);
        try (BufferedReader readerDocLine = new BufferedReader(new FileReader(file))) {
            String lineInTheDoc;
            while ((lineInTheDoc = readerDocLine.readLine()) != null) {
                if (isValidDocumNamber(lineInTheDoc)) {
                    System.out.println("Valid: " + lineInTheDoc);
                }else {
                    System.out.println("Not valid: " + lineInTheDoc);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static boolean isValidDocumNamber(String documNamber){
        return documNamber != null && (documNamber.startsWith("docnum")
                || documNamber.startsWith("contract"))
               && documNamber.length() == 15;
    }
}



