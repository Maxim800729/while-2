//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    }


            //Написать все фигуры используя while, do while
            //1)


            //System.out.println("*");
            //System.out.println("**");
            //System.out.println("***");
            //System.out.println("****");
            //System.out.println("*****");
            //System.out.println("******");
            //System.out.println("*******");
            //System.out.println("********");

            int x = 8;// Макс.значение строк и * в основании
            int y = 1;// Переменная-контролирует количество * в каждой строке. Начинаем с 1 т.к.1 строка сод.1*
            // использую while для каждой строки
            //while отвечает за строки треугольника. Выполняется пока количество строк не достигнет х=8
            //while будет выводить 1 *
            while (y <= x) {
                int z = 0;// Используется  для управлением количеством * в каждой строке

                // использую  while для печати * в одной строке

                while (z < y) {
                    System.out.print("*");// отвечает за вывод 1*при каждой интерации внутреннего цикла
                    z++;// Инкремитируем z. чтобы напечатать y *
                }
                System.out.println();//Переход на новую строку
                y++;// увеличиваем количество * для следующей строки
            }
            //System.out.println("********");
            //System.out.println("*******");
            //System.out.println("******");
            //System.out.println("*****");
            //System.out.println("****");
            //System.out.println("***");
            //System.out.println("**");
            //System.out.println("*");
            int i = 1;
            int a = 8;
            while (i<=a){
                int f =0;
                while(f < i ){
                    System.out.print("*");
                    f++;}
                System.out.println ();
                i++;}
        }

        