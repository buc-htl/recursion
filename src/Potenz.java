public class Potenz {


    /**
     *  Berechnet a^n mittels einer Schleife (iterativ)
     * @param a
     * @param n
     * @return
     */
    public static int pot(int a, int n) {
        int result = 1;
        while (n>0) {
            result = result * a;
            n = n - 1;
        }
        return result;
    }


    /**
     *  Berechnet a^n mittels Rekursion
     * @param a
     * @param n
     * @return
     */
    public static int potRekursiv(int a, int n) {
        if (n==0) {
            return 1;
        } else {
            return a * potRekursiv(a, n-1);
        }

    }


    public static void main(String[] args) {
        System.out.println(pot(2,4));
        System.out.println(potRekursiv(2,4));


    }
}
