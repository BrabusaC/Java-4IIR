package pk1;

import java.util.*;

import pk1.InstrumentMusical;

public class TableauInstru {
    private InstrumentMusical[] instruments;

    public TableauInstru() {
        instruments = new InstrumentMusical[4];
        instruments[0] = new InstrumentMusical("YAMAHA", 5.4, 10, 2020);
        instruments[1] = new InstrumentMusical("XXX", 6, 10, 2022);
        instruments[2] = new InstrumentMusical("YYY", 10.5, 50, 2023);
        instruments[3] = new InstrumentMusical("ZZZ", 2, 30, 2021);
    }
  
    public void trierElements() {
        Arrays.sort(instruments);
    }
    
    public void AjoutT(InstrumentMusical a)
    {
    	instruments = Arrays.copyOf(instruments, instruments.length + 1);
    	instruments[instruments.length - 1] = a;
    }
    public void SupprimerT(InstrumentMusical x)
    { 
    		ArrayList<InstrumentMusical> liste = new ArrayList<InstrumentMusical>(Arrays.asList(instruments));
    		liste.remove(x);
    		instruments= liste.toArray(new InstrumentMusical[liste.size()]);
    }
    public int compterElements() {
        return instruments.length;
    }
  
    public void inverserOrdre() {
        List<InstrumentMusical> instrumentList = Arrays.asList(instruments);
        Collections.reverse(instrumentList);
        instruments = instrumentList.toArray(new InstrumentMusical[instrumentList.size()]);
    }
    
    public void afficherElements() {
        for (InstrumentMusical instrument : instruments) {
            System.out.println(instrument.toString());
        }
    }
    public InstrumentMusical Max() {
        if (instruments.length == 0) {
            return null;
        }
        InstrumentMusical maxInstrument = instruments[0];
        for (InstrumentMusical instrument : instruments) {
            if (instrument.compareTo(maxInstrument) > 0) {
                maxInstrument = instrument;
            }
        }
        return maxInstrument;
    }
    public boolean testerEgalite(TableauInstru t) {
        return Arrays.equals(this.instruments, t.instruments);
    }
}


