import java.util.Objects;
import java.util.Scanner;

public class BibliotekaMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Biblioteka biblioteka = new Biblioteka();
        Knyga pasaka = new Knyga("Raudonkepuraite", "Autroius Nezinomas", "1920");
        biblioteka.pridetiKnyga(pasaka);
        for (Knyga k : biblioteka.knyguSarasas){
            System.out.println(biblioteka.knygosInfo(k));
        }

        System.out.println("Jeigu norite prideti knyga spauskite Y, jeigu pasiimiti - N");
        String pasirinkimas = scanner.nextLine();
        if (Objects.equals(pasirinkimas, "Y")){
            Knyga romanas = new Knyga();
            System.out.println("Iveskite knygos pavadinima: ");
            romanas.setPavadinimas(scanner.nextLine());
            System.out.println("Iveskite knygos autoriu: ");
            romanas.setAutorius(scanner.nextLine());
            System.out.println("Iveskite knygos leidimo metus: ");
            romanas.setLeidimoMetai(scanner.nextLine());
            biblioteka.pridetiKnyga(romanas);

        }else{
            System.out.println("Kokia knyga noretumete pasiimti?");
            String kPavadinimas = scanner.nextLine();
            biblioteka.pasiimtiKnyga(kPavadinimas);


        }
        for (Knyga k : biblioteka.knyguSarasas){
            System.out.println(biblioteka.knygosInfo(k));
        }

    }
}
