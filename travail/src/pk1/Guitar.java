package pk1;

import java.util.Objects;

public class Guitar extends InstrumentMusical  {
	private int nombreCordes;
    private String typeGuitare;
    
    
	public int getNombreCordes() {
		return nombreCordes;
	}

	public void setNombreCordes(int nombreCordes) {
		this.nombreCordes = nombreCordes;
	}

	public String getTypeGuitare() {
		return typeGuitare;
	}

	public void setTypeGuitare(String typeGuitare) {
		this.typeGuitare = typeGuitare;
	}

	public Guitar(String nom, double poids, double longueur, int anneeFabrication, int nombreCordes,
			String typeGuitare) {
		super(nom, poids, longueur, anneeFabrication);
		this.nombreCordes = nombreCordes;
		this.typeGuitare = typeGuitare;
	}

	@Override
	public String toString() {
		return "Guitar [nombreCordes=" + nombreCordes + ", typeGuitare=" + typeGuitare 
				+ super.toString() + ", getClass()=" + getClass()  + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guitar other = (Guitar) obj;
		return nombreCordes == other.nombreCordes && Objects.equals(typeGuitare, other.typeGuitare);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.clone();
	}

	@Override
	public int compareTo(Guitar other) {
		return this.compareTo(other);
	}
    
    
}
