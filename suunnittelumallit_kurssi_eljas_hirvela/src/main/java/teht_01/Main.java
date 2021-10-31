package main.java.teht_01;

public class Main {

    public static void main(String[] args) {
    	System.out.println("----OPETTAJA----");
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        System.out.println("----OPISKELIJA----");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        System.out.println("----TAVALLINEN TALLAAJA----");
        AterioivaOtus tavallinenTallaaja = new TavallinenTallaaja();
        tavallinenTallaaja.aterioi();
    }
}
