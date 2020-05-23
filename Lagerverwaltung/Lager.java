package Stunde6AUFGABE;

import java.util.Vector;

public class Lager {
    Vector<String> Produkt = new Vector();
    Vector<Integer> Lagerbestand = new Vector();


    public void produktHinzufügen(String Produktname, int Anzahl) {
        if(Produkt.contains(Produktname)){
            int stelle = Produkt.indexOf(Produktname);
            Lagerbestand.set(stelle, Anzahl + Lagerbestand.elementAt(stelle));
        }
        else {
            Produkt.add(Produktname);
            Lagerbestand.add(Anzahl);
        }
    }

    public void getProduct(String Produktname, int anzahlMinus) throws Exception {
        int stelle = 0;
        for (int i = 0; i < Produkt.size(); i++) {
            if (Produktname.equals(Produkt.elementAt(i))) {
                stelle = i;
            } else throw new Exception("Diese Produkt ist nicht in diesem Lager vorhanden");
        }
        if (Lagerbestand.elementAt(stelle)-anzahlMinus>0){
            Lagerbestand.set(stelle,Lagerbestand.elementAt(stelle)-anzahlMinus);}
        else throw new Exception ("Es sind nicht mehr ausreichend viele Produkte im Lager.");
        //hier möchte in den Wert des Lagerbestands im Vector verändern
    }
    public int getLagerbestand(String Produktname) throws Exception{
            int stelle = 0;
            for (int i = 0; i < Produkt.size(); i++) {
                if (Produktname.equals(Produkt.elementAt(i))){
                    stelle = i;}
                else
                throw new Exception("Dieses Produkt ist nicht im Lager vorhanden.");
            }
            return (int) Lagerbestand.elementAt(stelle);
        }
    }



