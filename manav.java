import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int armut,elma,domates,muz,patlıcan;
        double toplam;

        System.out.print("armut kac kilo : ");
        armut=inp.nextInt();

        System.out.print("elma kac kilo : ");
        elma=inp.nextInt();

        System.out.print("domates kac kilo : ");
        domates=inp.nextInt();

        System.out.print("muz kac kilo : ");
        muz=inp.nextInt();

        System.out.print("patlıcan kac kilo : ");
        patlıcan=inp.nextInt();

        toplam=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5));

        System.out.print("toplam tutar : "+toplam+" TL");
    }
}
