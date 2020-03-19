package ro.ase.csie.cts.g1084.tema2;

public class Cursant implements Financiar {
	private String nume;
	private int varsta;
	private float sumaAchitata;
	
	public Cursant(String nume, int varsta)
	{
		setNume(nume);;
		setVarsta(varsta);
		this.sumaAchitata = 0f;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public float getSumaAchitata() {
		return sumaAchitata;
	}

	public void setSumaAchitata(float sumaAchitata) {
		this.sumaAchitata = sumaAchitata;
	}

	@Override
	public void achitaSuma(float suma) {
		this.sumaAchitata += suma; 		
	}
	
	
	
}
