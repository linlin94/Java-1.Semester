package Stunde8_281119;

public class Arzt extends Angestellter {

    int rang;

    public Arzt(String name, int alter, float stundenlohn, int steuerklasse, Zeitkonto konto, float überstundenbonus) {
        super(name, alter, stundenlohn, steuerklasse, konto, überstundenbonus);
    }
}
