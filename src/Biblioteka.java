import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    List<Knyga> knyguSarasas = new ArrayList<>();

    public String knygosInfo(Knyga knyga){
        String autorius = knyga.getAutorius();
        String pavadinimas = knyga.getPavadinimas();
        String metai = knyga.getLeidimoMetai();

        return pavadinimas + "|" + autorius + "|" + metai;
    }

    public void pridetiKnyga(Knyga knyga){
        knyguSarasas.add(knyga);
        System.out.println("Prideta knyga: " + knygosInfo(knyga));
    }
    public void pasiimtiKnyga(String pavadinimas){
        for (Knyga k : knyguSarasas){
            if (k.getPavadinimas().equals(pavadinimas)){
                knyguSarasas.remove(k);
                System.out.println("Paimta knyga: " + knygosInfo(k));
                break;
            }
        }
    }
}
