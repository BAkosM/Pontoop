package hu.petrik.pontoop.ember;
import java.time.LocalDate;
public class ember {
    private String nev;
    private String szuldate;
    private String szulhely;
    public ember(){
        this.nev="";
        this.szuldate="";
        this.szulhely="";
    }
    public ember(String nev, String szuldate, String szulhely){
        this.nev=nev;
        this.szuldate=szuldate;
        this.szulhely=szulhely;
    }
    public int getSzulev(){
        return Integer.parseInt(szuldate.substring(0,4));
    }
    public int getSzulho(){
        return Integer.parseInt(szuldate.substring(6,7));
    }
    public int getSzulnap(){
        return Integer.parseInt(szuldate.substring(9,10));
    }
    public int getKor(){
        LocalDate mainDatum = LocalDate.now();
        return mainDatum.getYear();
    }
    @Override
    public String toString() {
        return String.format(nev +" "+ szuldate + " "+ szulhely);
    }
}
