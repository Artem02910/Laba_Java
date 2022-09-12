package laba_1;
import java.util.Scanner; // импортируем класс для ввода

public class Sum {
    int[] mas;
    int itog;

    public Sum(int kol){
        mas = new int[kol];
    }

    public void Vvod(){
        System.out.print("Введите " + this.mas.length + " целых чисел\n");
        for(int i=0;i<this.mas.length;i++){
            Scanner sc = new Scanner(System.in);
            int chisl = sc.nextInt();
            mas[i] = chisl;
        }
    }

    public void SmDoWhile(){
        int kol = mas.length;
         do{
            itog = itog + mas[kol-1];
            kol--;
        }while(kol!=0);
    }

    public void SmWhile(){
        int kol = mas.length;
        while(kol!=0){
            itog = itog + mas[kol-1];
            kol--;
        }
    }

    public void SmFor(){
        for(int i=0;i<this.mas.length;i++){
            itog = itog + mas[i];
        }
    }

    public void Strelka(int a){
        if(a==1) SmDoWhile();
        if(a==2) SmWhile();
        if(a==3) SmFor();
    }

    public String toString(){
        return "Сумма такова: " + this.itog;
    }
}
