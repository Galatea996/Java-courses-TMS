package HomeWork5;

/*
 Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
B(Black) или W(White). Результат работы программы:

W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
*/

public class ChessBoard {
    public static void main(String[] args) {
        String[][] mass = new String[][]{{"W"},{"B"}
        };
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if(i % 2 == 0 && j % 2 == 0){
                    System.out.print("W ");
                } else if (i % 2 == 1 && j % 2 == 1) {
                    System.out.print("W ");
                }else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }



    }
}
