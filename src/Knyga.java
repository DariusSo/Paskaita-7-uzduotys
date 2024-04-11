public class Knyga {
    private String pavadinimas;
    private String autorius;
    private String leidimoMetai;
    private String skaitytojoID;

    public Knyga(String pavadinimas, String autorius, String leidimoMetai) {
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.leidimoMetai = leidimoMetai;
    }
    public Knyga(){

    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setAutorius(String autorius) {
        this.autorius = autorius;
    }

    public void setLeidimoMetai(String leidimoMetai) {
        this.leidimoMetai = leidimoMetai;
    }

    public void setSkaitytojoID(String skaitytojoID) {
        this.skaitytojoID = skaitytojoID;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAutorius() {
        return autorius;
    }

    public String getLeidimoMetai() {
        return leidimoMetai;
    }

    public  String getSkaitytojoID() {
        return skaitytojoID;
    }
}
