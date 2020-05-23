package Stunde8_281119;

public class Main {

    public static void main(String args[]) {
        Zeitkonto.minUmrechnen(90);
        System.out.println("Saldo von Zeitkonto: " + Zeitkonto.getSaldo(100,80));

        Zeitkonto k1 = new Zeitkonto(120,150,40);
        Angestellter a1 = new Angestellter("Alex",19, 15.5f,1, k1, 3.4f);

        System.out.println("Stundenlohn von a1: " + a1.stundenlohn + "\n" + "Überstundenbonus von a1: " + a1.überstundenbonus + "" +
                "\n" + "Steuerklasse von a1:  " + a1.steuerklasse + "\n" + "Istzeit von k1 in Minuten: " + k1.istzeit);

        System.out.println("Monatslohn von a1 brutto: " + a1.GetMonatslohn(true));
        System.out.println("Monatslohn von a1 netto: " + a1.GetMonatslohn(false));

        k1.arbeitszeitÄndern(15,false);
        System.out.println("Sollzeit von k1 in Minuten: " + k1.sollzeit);
    }
}
