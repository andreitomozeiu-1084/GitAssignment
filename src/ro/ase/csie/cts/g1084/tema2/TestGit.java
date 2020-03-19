package ro.ase.csie.cts.g1084.tema2;

public class TestGit {

	public static void main(String[] args) {
		String denumireProiectLicenta = "Aplicatie pentru management-ul activitatilor unei scoli auto";
		
		System.out.println("Hello Git! Denumirea proiectului de licenta este \"" + denumireProiectLicenta + "\"");
		
		Cursant cursant = new Cursant("Ion", 25);
		System.out.println("Suma achitata: " + cursant.getSumaAchitata());
		cursant.achitaSuma(450);
		System.out.println("Suma achitata: " + cursant.getSumaAchitata());
	}

}
