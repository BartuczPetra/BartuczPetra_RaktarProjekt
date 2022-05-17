package modell;

import java.io.File;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer{
    private String leiras;
    private File recept;

    public Konzerv(String leiras, String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        this(leiras,new File("nincs"),nev,gyarto,lejaratiDatum);
    }
    
    public Konzerv(String leiras, File recept, String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
        this.recept = recept;
    }
    
    public void receptMutat(){
        if(recept.exists()){}
    }
    
}
