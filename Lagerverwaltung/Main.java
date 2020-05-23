package Stunde6AUFGABE;

public class Main {

    public static void main(String args[]) throws Exception{

        Lagerverwaltung LV1 = new Lagerverwaltung();

        System.out.println("Befehle:\n" +
                "/bestand - ruft den Lagerbestand eines Produktes auf\n" +
                "/produktHinzufügen - fügt eine Anzahl an einem Produkt dem Lager hinzu\n" +
                "/getProdukt - nimmt eine Anzahl eines Produktes aus dem Lager heraus\n" +
                "/exit - beendet das Programm\n" +
                "Gebe nun einen Befehl ein:");
        LV1.Update();

    }
}
