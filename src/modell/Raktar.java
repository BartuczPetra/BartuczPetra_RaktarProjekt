package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>{
    private ArrayList<Elelmiszer> elelmiszerek;

    public Raktar() {
        this.elelmiszerek=new ArrayList<>();
    }
    
    public void felvesz(Elelmiszer elelmiszer){
        elelmiszerek.add(elelmiszer);
    }
    
    public List<Elelmiszer> rendezNevSzerint(){
        Collections.sort(elelmiszerek, Elelmiszer.NevRendezo());
        return Collections.unmodifiableList(elelmiszerek);
    }
    
    public List<Elelmiszer> rendezGyartoSzerint(){
        Collections.sort(elelmiszerek, Elelmiszer.gyartoRendezo());
        return Collections.unmodifiableList(elelmiszerek);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmiszerek).iterator();
    }
    
}
