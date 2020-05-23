package Stunde6AUFGABE;

import com.sun.source.doctree.ValueTree;

import java.util.Scanner;

public class Lagerverwaltung {

    Lager lager = new Lager();

    public void Update() {
        Scanner s = new Scanner(System.in);                       //steht bereits beides außerhalb oben.
        while (true) {

            String eingabe = s.nextLine();

            if (eingabe.equals("/produktHinzufügen")) {
                System.out.println("Bitte geben Sie ein Produkt ein: ");
                String produktstr = s.nextLine();
                System.out.println("Wieviel Stück sollen hinzugefügt werden:");
                String anzahlstr = s.nextLine();
                try {
                int anzahl = Integer.parseInt(anzahlstr);
                Produkt produkt = new Produkt();
                produkt.name = produktstr;
                lager.produktHinzufügen(produktstr, anzahl); }
                catch (Exception ee) {
                    System.out.println("Ups, da ist was schief gelaufen. Versuche es nochmal.");
                }
            }

            if (eingabe.equals("/bestand")) {
                System.out.println("Bitte geben Sie ein Produkt ein:");
                String produktname = s.nextLine();
                Produkt p1 = new Produkt();
                p1.name = produktname;
                try {
                    System.out.println("Lagerbestand von " + ": " + lager.getLagerbestand(produktname));
                }
                catch (Exception e) {
                    System.out.println("Produkt nicht im Lager.");
                }
            }

            if(eingabe.equals("/getProdukt")){
                System.out.println("Bitte geben Sie ein Produkt ein:");
                String produktname=s.nextLine();
                System.out.println("Wieviel Stück sollen vom Lager entnommen werden:");
                String anzahlweg = s.nextLine();
                int anzahlminus = Integer.parseInt(anzahlweg);
                Produkt produkt = new Produkt();
                produkt.name = produktname;
                try{
                lager.getProduct(produktname, anzahlminus);}
                catch(Exception fehler) {
                    System.out.println("Das entnehmen des Produkts aus dem Lager war nicht möglich.");
                }
            }

            if (eingabe.equals("/exit"))
                break;
        }
    }

    public void moveProduct(String Produktname, Lager Alt, Lager Neu) {
        int stelle = 0;
        for(int i=0; i<Alt.Produkt.size(); i++) {
            if(Produktname.equals(Alt.Produkt.elementAt(i)))
                stelle = i;
        }
        Alt.Produkt.remove(stelle);
        Neu.Produkt.add(Produktname);
        Neu.Lagerbestand.add(Alt.Lagerbestand.elementAt(stelle));
        Alt.Lagerbestand.remove(stelle);
    }
}
