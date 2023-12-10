package pk1;

import java.util.*;

public class InstrumentMusical implements Cloneable ,Comparable<InstrumentMusical>  {
	private String nom;
	 private double poids;
	 private double longueur;
	 private int anneeFabrication;
	 
public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public int getAnneeFabrication() {
		return anneeFabrication;
	}

	public void setAnneeFabrication(int anneeFabrication) {
		this.anneeFabrication = anneeFabrication;
	}

public InstrumentMusical(String nom, double poids, double longueur, int anneeFabrication) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.longueur = longueur;
		this.anneeFabrication = anneeFabrication;
	}

@Override
public String toString() {
	return "InstrumentMusical [nom=" + nom + ", poids=" + poids + ", longueur=" + longueur + ", anneeFabrication="
			+ anneeFabrication + "]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	   InstrumentMusical that = (InstrumentMusical) obj;
       return Double.compare(that.poids, poids) == 0 &&
               Double.compare(that.longueur, longueur) == 0 &&
               anneeFabrication == that.anneeFabrication &&
               nom.equals(that.nom);
   }


@Override
public Object clone() throws CloneNotSupportedException {
	try {return super.clone();}
   
    catch (CloneNotSupportedException e) 
    {throw new CloneNotSupportedException();}
}
@Override
public int compareTo(InstrumentMusical autreInstrument) {
    return this.nom.compareTo(autreInstrument.nom);
}

public int compareTo(Piano other) {
	return 0;
}
public int compareTo(Guitar other) {
	return 0;
}


}



