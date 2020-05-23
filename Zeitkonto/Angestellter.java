package Stunde8_281119;

public class Angestellter extends Person {

    float stundenlohn;
    int steuerklasse;
    Zeitkonto konto;
    float überstundenbonus;


    public Angestellter(String name, int alter, float stundenlohn, int steuerklasse, Zeitkonto konto, float überstundenbonus) {
        super(name, alter);
        this.stundenlohn = stundenlohn;
        this.steuerklasse = steuerklasse;
        this.konto = konto;
        this.überstundenbonus = überstundenbonus;

    }

    public float GetMonatslohn(boolean brutto) {
        if(brutto==true) {
            return stundenlohn*konto.istzeit+getÜberstundenbonus();
        }
        else {
            return (stundenlohn*konto.istzeit+getÜberstundenbonus())-(stundenlohn*konto.istzeit+getÜberstundenbonus()*getSteuerklasse(steuerklasse));
        }
    }

    public float getÜberstundenbonus() {
        if(konto.istzeit>konto.sollzeit) {
            return (konto.istzeit-konto.sollzeit)*überstundenbonus;
        }
        else {
            return 0.0f;
        }
    }

    public float getSteuerklasse(int steuerklasse) {
        switch(steuerklasse) {
            case 0:
                return 0.0f;
            case 1:
                return 0.12f;
            case 2:
                return 0.18f;
            case 3:
                return 0.23f;
            case 4:
                return 0.29f;
            case 5:
                return 0.38f;
            case 6:
                return 0.45f;
            default:
                return 0.0f;
        }
    }
}
