package modell;

import java.io.File;

public abstract class Konzerv extends Elelmiszer{
    private String leiras;
    private File recept;

    public Konzerv(String nev, String gyarto) throws HibasDatumException {
        super(nev, gyarto);
    }

    public void receptMutat(){
        if(recept.exists()){}
    }
    
}
