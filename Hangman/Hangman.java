package Hangman;

import java.util.Scanner;

public class Hangman {

    public static void main(String args[]) {

        System.out.println("Willkommen bei Hangman! Tippen Sie zuerst das gesuchte Wort ein:");
        Scanner s = new Scanner(System.in);

        String wort;
        int versuche = 12;

        String eingabe = s.next();

        wort = eingabe;

        System.out.println(" \n \n \n \n \n \n \n \n \n");

        punkteAusgeben(wort);

        System.out.println("Jetzt geht das Raten los! Du hast 12 Versuche. Wenn du keinen Bock mehr hast gebe einfach /exit ein.\n" +
                "Und nun gib einen Buchstaben ein:");

        //gesuchtes Wort mit selber Länge wie eingegebenes Wort wird mit "-" gefüllt.
        char[] suchWort = new char[wort.length()];
        for(int k=0; k<wort.length(); k++){
            suchWort[k]='-';
        }



        while (versuche!=0) {

            String eingabe2 = s.next();

            if (eingabe2.equals("/exit"))
                break;

            if (eingabe2.length()==1) {

                //char buchstabe = eingabe2.charAt(0);

                if(wort.contains(eingabe2)) {
                    System.out.println("Der Buchstabe " + eingabe2 + " ist im Wort enthalten.");
                    char buchstabe = eingabe2.charAt(0);
                    for (int i = 0; i < wort.length(); i++) {
                        if(buchstabe==wort.charAt(i)) {
                            suchWort[i]=wort.charAt(i);
                        }
                    }
                }
                else {
                    versuche--;
                    System.out.println("Der Buchstabe " + eingabe2 + " ist nicht in dem Wort vorhanden. Du hast noch " + versuche + " Versuche!");
                }
                System.out.println(suchWort);
            }
            else {
                System.out.println("Du darfst nur einen Buchstaben eingeben, du Wicht!");
            }

            int counter = 0;
            for(int l=0; l<wort.length(); l++){
                if(suchWort[l]==wort.charAt(l)){
                    counter ++;
                }
            }
            if(counter==wort.length()){
                System.out.println("Yeah, du hast es geschafft. Du bist der KING!");
                break;
            }

            if (versuche == 0){
                System.out.println("Du hast es nicht geschafft du Loser. Versuche es nochmal");
            break;
            }

        }


    }
    public static void punkteAusgeben(String wort){
        for(int i=0; i<wort.length(); i++){
            System.out.print("-");
        }
        System.out.println(" ");
    }

}

/*
- wenn Buchstabe schon dran war, kann man ihn nicht mehr nehmen
- nur Buchstaben verwendbar
- Angabe welche Buchstaben man schon hatte
 */
