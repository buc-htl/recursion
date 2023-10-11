import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *    Bilde alle möglichen Kombinationen der Länge n aus einer Liste von Zahlen ("vorrat").
 *  	Kann mit n verschachtelten Schleifen gelöst werden oder, etwas eleganter, mit einer Rekursion
 *
 * 	    Beispiel: n=3, vorrat=[1,2,3,4]
 *      *  Ergebnis:
 *                   111
 *                   112
 *                   113
 *                   114
 *                   121
 *                   122
 *                   ...
 *
 */
public class Permutation {


    public static void main(String[] args) {
        List<Integer> vorrat = new ArrayList<>(Arrays.asList(1,2,3,4));
        //perm_step1(3,vorrat);
        //perm_step2(3, vorrat);
        //perm_step3(3, vorrat);
        //perm_step4(3, vorrat,"");
        System.out.println(perm_step5(3, vorrat,""));
    }

    /**
     *  1. Schritt (funktioniert noch nicht)
     *
     *  Überlegung: erzeuge eine Stelle und nütze die Funktion um rekursiv
     *  die restlichen Stellen zu erzeugen.
     *
     *  Um das Problem "erstelle alle Kombinationen mit der Länge n" zu lösen, probiert man
     *  das Problem "erstelle alle Kombinationen mit der Länge n-1 zu lösen"
     *  und nur alle Kombinationen für 1 Stelle direkt zu ermitteln ("base case").
     */

    private static void perm_step1(int n, List<Integer> vorrat) {
        for (int i:vorrat) {
            System.out.print(i + " ");
            perm_step1(n-1,vorrat);
        }
    }

    /**
     * Jede rekursive Methode benötigt eine Abbruchbedingung, damit sie nicht ewig sich selbst aufruft.
     */
    private static void perm_step2(int n, List<Integer> vorrat) {

        //Abbruchbedingung
        if(n==0) {
            return;
        }
        //rekursiver Fall
        for (int i:vorrat) {
            System.out.print(i + " ");
            perm_step2(n-1, vorrat);
        }
    }

    /**
     * Formatierung: nach jeder Kombination wollen wir einen Zeilenumbruch.
     *
     * Es funktioniert leider nicht, da in der Rekursion immer nur die letzten Stellen neu hinzukommen.
     */
    private static void perm_step3(int n, List<Integer> vorrat) {

        //Abbruchbedingung
        if(n==0) {
            System.out.println();
            return;
        }
        //rekursiver Fall
        for (int i:vorrat) {
            System.out.print(i + " ");
            perm_step3(n-1, vorrat);
        }
    }

    /**
     *  "Sammeln" das Ergebnis über die rekursiven Aufrufe und geben es am Schluss aus.
     *  Beachte wie flexibel diese Lösung ist. Ohne Probleme kann die Anzahl der Stellen und der vorrat geändert werden.
     * @param n
     * @param vorrat
     * @param tmp
     */

    private static void perm_step4(int n, List<Integer> vorrat, String tmp) {

        //Abbruchbedingung
        if(n==0) {
            System.out.println(tmp);
            return;
        }
        //rekursiver Fall
        for (int i:vorrat) {
            //System.out.print(i + " ");
            perm_step4(n-1, vorrat,tmp + i + " ");
        }
    }


    /**
     * Eine letzte Verbesserung: Die Methode gibt das Ergebnis als String zurück und nicht direkt in der Konsole aus.
     */
    private static String perm_step5(int n, List<Integer> vorrat, String tmp) {
        String result="";

        //Abbruchbedingung
        if(n==0) {
            return tmp+"\n";
        }
        //rekursiver Fall
        for (int i:vorrat) {
             result += perm_step5(n-1, vorrat,tmp + i + " ");
        }

        return result;
    }



/**
 *  Allgemeine Struktur rekursiver Methoden:
 *  recursiveMethod(parameters) {
 *      if (stopping condition) {
 *            // handle the base case
 *      } else {
 *            // recursive case:
 *            // possibly do something here
 *            recursiveMethod(modified parameters);
 *            // possibly do something here
 *        }
 * }
 *
 */
}
