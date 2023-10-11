public class SimpleCounter {

    public static void main(String[] args) {
        new SimpleCounter().count(10);
    }


    public void count(int n) {

        if (n==0) {
            System.out.println("Countdown abgelaufen");
        } else {
            System.out.println(n);
            count(n-1);
        }

    }

    /**
     * Allgemeine Struktur rekursiver Methoden:
     *
     * recursiveMethod(parameters) {
     *  *      if (stopping condition) {
     *  *            // handle the base case
     *  *      } else {
     *  *            // recursive case:
     *  *            // possibly do something here
     *  *            recursiveMethod(modified parameters);
     *  *            // possibly do something here
     *  *        }
     *  * }
     */


}
