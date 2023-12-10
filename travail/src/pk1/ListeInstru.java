package pk1;

import java.util.*;

import pk1.InstrumentMusical;

public class ListeInstru {
	private List<InstrumentMusical> instruments;

    public ListeInstru() {
        instruments = new ArrayList<>();
    }

    public void alimenterListe(List<InstrumentMusical> instruments) {
        this.instruments.addAll(instruments);
    }

    public void afficherListe() {
        for (InstrumentMusical instrument : instruments) {
            System.out.println(instrument.toString());
        }
    }
    public void parcourirListe() {
        Iterator<InstrumentMusical> iterator = instruments.iterator();
        while (iterator.hasNext()) {
            { System.out.println(iterator.next()); }

        }
    }

    public void insererElement(InstrumentMusical instrument) {
        this.instruments.add(instrument);
    }

    public InstrumentMusical recupererElement(int index) {
        return this.instruments.get(index);
    }

    public void supprimerElement(InstrumentMusical instrument) {
        this.instruments.remove(instrument);
    }

    public boolean rechercherElement(InstrumentMusical instrument) {
        return this.instruments.contains(instrument);
    }

    public void trierListe() {
        Collections.sort(instruments);
    }
    
     //copier la liste dans un nouveau tableau 
    public InstrumentMusical[] copierListeDansTableau() {
        InstrumentMusical[] nouveauTableau = new InstrumentMusical[instruments.size()];

        for (int i = 0; i < instruments.size(); i++) {
            nouveauTableau[i] = instruments.get(i);
        }

        return nouveauTableau;
    }
   
    public void melangerListe() {
        Collections.shuffle(instruments);
    }

    public void inverserListe() {
        Collections.reverse(instruments);
    }

    public List<InstrumentMusical> extrairePartieListe(int debut, int fin) {
        return new ArrayList<InstrumentMusical>(instruments.subList(debut, fin));
    }

    public boolean comparerListes(List<InstrumentMusical> autreListe) {
        return this.instruments.equals(autreListe);
    }

    public void echangerElements(int index1, int index2) {
        Collections.swap(instruments, index1, index2);
    }

    public void viderListe() {
        this.instruments.clear();
    }

    public boolean testerListeVide() {
        return this.instruments.isEmpty();
    }
}




