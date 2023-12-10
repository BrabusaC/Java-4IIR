package pk1;

import java.util.*;
import pk1.*;


public class Test {

	public static void main(String[] args) {
		 //  Création d'instruments
        InstrumentMusical instrument1 = new InstrumentMusical("Guitare", 3.5, 100.0, 2020);
        InstrumentMusical instrument2 = new InstrumentMusical("Violon", 0.8, 60.0, 2018);

        //  Création d'un piano
        Piano piano = new Piano("Piano à queue", 500.0, 200.0, 2015, 88,"XX");
     // Question 2 - Création d'une guitar
        Guitar guitar = new Guitar("Guitar à queue", 500.0, 200.0, 2015, 88,"Rock");

        // Test de la classe TableauInstru
        InstrumentMusical[] instrumentsArray = {instrument1, instrument2, piano};
        TableauInstru tableau = new TableauInstru();

        tableau.trierElements();
        tableau.afficherElements();

        InstrumentMusical nouvelInstrument = new InstrumentMusical("Trompette", 1.2, 50.0, 2019);
        tableau.AjoutT(nouvelInstrument);
        tableau.afficherElements();

        tableau.SupprimerT(instrument1);
        tableau.afficherElements();

        System.out.println("Nombre d'instruments : " + tableau.compterElements());

        tableau.inverserOrdre();
        tableau.afficherElements();

        System.out.println("Instrument le plus grand : " + tableau.Max());

        TableauInstru autreTableau = new TableauInstru();
        System.out.println("Les tableaux sont égaux : " + tableau.testerEgalite(autreTableau));

        List<InstrumentMusical> instrumentsList = new ArrayList<>(Arrays.asList(instrumentsArray));
        ListeInstru liste = new ListeInstru();
        liste.alimenterListe(instrumentsList);

        liste.trierListe();
        liste.afficherListe();

        InstrumentMusical nouvelInstrumentListe = new InstrumentMusical("Saxophone", 2.0, 70.0, 2017);
        liste.insererElement(nouvelInstrumentListe);
        liste.afficherListe();

        System.out.println("Élément à l'index 1 : " + liste.recupererElement(1));

        liste.supprimerElement(instrument2);
        liste.afficherListe();

        System.out.println("Recherche de Violon : " + liste.rechercherElement(instrument2));

        liste.melangerListe();
        liste.afficherListe();

        System.out.println("La liste transformé en tableau :"+ liste.copierListeDansTableau());

        liste.echangerElements(0, 2);
        liste.afficherListe();

        System.out.println("La liste est vide : " + liste.testerListeVide());
        liste.viderListe();
        System.out.println("La liste est vide : " + liste.testerListeVide());
    }
	

}
