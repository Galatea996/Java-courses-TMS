package HomeWork10.Task2;
/*
1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на вход
программы строку.
 */
public class Main {

    public static void main(String[] args) {
        GeneralNumberDoc.twoBlocks();
        GeneralNumberDoc.replacingThreeLettersInBlocks();
        GeneralNumberDoc.lettersHigh();
        GeneralNumberDoc.lettresLower();

        try {
            Secuance.sequenceAbc("abc");
        } catch (SequenceAbcException eAbc) {
            if (Secuance.retVal) {
                System.out.println("Result: " + true);
            } else {
                System.out.println("Exception caught: " + eAbc + "\n");
            }

            try {
                Secuance.sequenceNum(555);
            } catch (SequenceNumException eNam) {
                if (Secuance.retVal) {
                    System.out.println("Result: " + true);
                } else {
                    System.out.println("Exception caught: " + eNam + "\n");
                }

                try {
                    Secuance.sequenceStr("1a2b");
                } catch (SequenceStrException eStr) {
                    if (Secuance.retVal) {
                        System.out.println("Result: " + true);
                    } else {
                        System.out.println("Exception caught: " + eStr);
                    }

                }
            }
        }
    }
}


