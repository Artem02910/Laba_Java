package laba_1; //var 1
import java.util.Scanner; // импортируем класс для ввода

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int kol = sc.nextInt();

        Sum obj = new Sum(kol);
        obj.Vvod();

        System.out.print("Введите каким способом хотите найти сумму\n" +
                "1 - do_while\n" +
                "2 - while\n" +
                "3 - for\n");
        int a = sc.nextInt();
        obj.Strelka(a);

        System.out.print(obj);
    }
}
