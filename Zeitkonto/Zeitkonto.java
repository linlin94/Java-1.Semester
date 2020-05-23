package Stunde8_281119;

public class Zeitkonto {
    int sollzeit;
    int istzeit;
    int wochenarbeitsstunden;

    public Zeitkonto(int sollzeit, int istzeit, int wochenarbeitsstunden) {
        this.istzeit = istzeit;
        this.sollzeit = sollzeit;
        this.wochenarbeitsstunden = wochenarbeitsstunden;
    }

    public static void minUmrechnen(int minuten) {
        int stunden;
        stunden = minuten/60;
        minuten = minuten%60;
        System.out.println(stunden +" Std und "+ minuten + " min.");
    }

    public static int getSaldo(int istzeit, int sollzeit) {
        int saldo;
        saldo = istzeit - sollzeit;
        return saldo;
    }

    public void arbeitszeitÄndern(int zeit, boolean istkonto) {
        if(istkonto==true) {
            istzeit=zeit+istzeit;
        }
        else {
            sollzeit=zeit+sollzeit;
        }
    }
}

