//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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

            int z;

            while (y <= x){ // использую while для каждой строки
                //while отвечает за строки треугольника. Выполняется пока количество строк не достигнет х=8
                //while будет выводить 1 *
        z = 0;// Используется  для управлением количеством * в каждой строке

        // использую  while для печати * в одной строке

        while (z < y) {
            System.out.print("*");// отвечает за вывод 1*при каждой интерации внутреннего цикла
            z++;// Инкремитируем z. чтобы напечатать y *
        }
            System.out.println();//Переход на новую строку
            y++;// увеличиваем количество * для следующей строки
        }
System.out.println();

        int x1=8;
        int y1=8;
        int z1;
        while (y1 >0 ){
            z1 = 0;
        while (z1<y1){
            System.out.print("*");
            z1++;
        }
        System.out.println();
        y1--;
        }
    }}

        