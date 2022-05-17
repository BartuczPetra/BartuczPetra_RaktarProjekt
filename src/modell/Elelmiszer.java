package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

class NevComparator implements Comparator<Elelmiszer>{
    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getNev(), o2.getNev());
    } 
}

class GyartoComparator implements Comparator<Elelmiszer>{
    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getGyarto(), o2.getGyarto());
    } 
}

public class Elelmiszer{
    private String nev, gyarto;
    private LocalDate lejaratiDatum;
    
    public Elelmiszer(String nev, String gyarto) throws HibasDatumException {
        this(nev,gyarto, LocalDate.now().plusYears(1));
    }

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        if(this.lejaratiDatum.isBefore(LocalDate.now())){
            throw new HibasDatumException("Lejárt élelmiszer!");
        }
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = lejaratiDatum;
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    public LocalDate getLejaratiDatum() {
        return lejaratiDatum;
    }

    public static NevComparator NevRendezo(){
        return new NevComparator();
    }
    
    public static GyartoComparator gyartoRendezo(){
        return new GyartoComparator();
    }
    
    
    
    
}
