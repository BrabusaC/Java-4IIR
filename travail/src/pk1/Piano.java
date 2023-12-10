package pk1;

import java.util.*;

public class Piano extends InstrumentMusical  {
	 private int nombreTouches;
	 private String fabricant;
	 
	 
	public int getNombreTouches() {
		return nombreTouches;
	}

	public void setNombreTouches(int nombreTouches) {
		this.nombreTouches = nombreTouches;
	}

	public String getFabricant() {
		return fabricant;
	}

	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}

	public Piano(String nom, double poids, double longueur, int anneeFabrication, int nombreTouches, String fabricant) {
		super(nom, poids, longueur, anneeFabrication);
		this.nombreTouches = nombreTouches;
		this.fabricant = fabricant;
	}

	@Override
	public String toString() {
		return "Piano [nombreTouches=" + nombreTouches + ", fabricant=" + fabricant +  super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piano other = (Piano) obj;
		return Objects.equals(fabricant, other.fabricant) && nombreTouches == other.nombreTouches;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.clone();
	}

	@Override
	public int compareTo(Piano other) {
	    return Integer.compare(this.nombreTouches, other.nombreTouches);
	}
	 
	
	
    

    
}
