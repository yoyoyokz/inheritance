
public class CompteBanquaire {
private double solde;

public CompteBanquaire(double solde) {
	super();
	this.solde = solde;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}
void deposer(double montant)
{
	solde+=montant;
}
void retirer (double montant)
{
	if (solde>=montant)
	{
		solde-=montant;
		
	}
	System.out.println("Votre nouveau solde est de "+solde);
}
void imprimehistorique()
{
	System.out.println("Votre nouveau solde est de "+solde);
}

}
