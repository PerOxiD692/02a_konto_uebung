public class App {

    public static void main(String[] args) {
        Konto konto1 = new Konto();
        ausgabe("Konto1: " + Integer.toString(konto1.kontostand));
        konto1.vervielfältigung(2);
        ausgabe("Konto1, neu: " + Integer.toString(konto1.kontostand));

        Konto konto2 = new Konto();
        ausgabe("Konto2: " + Integer.toString(konto2.kontostand));
        konto2.vervielfältigung(3);
        ausgabe("Konto2, neu: " + Integer.toString(konto2.kontostand));

        Konto konto3 = new Konto();
        ausgabe("Konto3: " + Integer.toString(konto3.kontostand));
        konto3.vervielfältigung(10);
        ausgabe("Konto3, neu: " + Integer.toString(konto3.kontostand));
    }

    public static void ausgabe(String getStr){
        System.out.println(getStr);
    }
}
