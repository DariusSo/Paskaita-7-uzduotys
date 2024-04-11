import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Biblioteka {
    List<Knyga> knyguSarasas = new ArrayList<>();

    public String knygosInfo(Knyga knyga){
        String autorius = knyga.getAutorius();
        String pavadinimas = knyga.getPavadinimas();
        String metai = knyga.getLeidimoMetai();
        String sID = knyga.getSkaitytojoID();

        return pavadinimas + "|" + autorius + "|" + metai + "|" + sID;
    }

    public void pridetiKnyga(Knyga knyga){
        knyguSarasas.add(knyga);
        System.out.println("Prideta knyga: " + knygosInfo(knyga));
    }
    public void pasiimtiKnyga(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kokia knyga noretumete pasiimti?");
        String pavadinimas = scanner.nextLine();
        Random random = new Random();
        for (Knyga k : knyguSarasas){
            try {
                if (k.getPavadinimas().equals(pavadinimas)) {
                    knyguSarasas.remove(k);
                    k.setSkaitytojoID(String.valueOf(random.nextInt(100000, 200000)));
                    System.out.println("Paimta knyga: " + knygosInfo(k));
                    break;
                } else {
                    throw new Exception("Tokios knygos neturime.");
                }
            }catch(Exception e){
                System.out.println("Tokios knygos nera.");
                pasiimtiKnyga();
                break;

            }
        }
    }
}
