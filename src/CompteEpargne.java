
public class CompteEpargne extends CompteBanquaire {
private double taux;

public CompteEpargne(double solde, double taux) {
	super(solde);
	this.taux = taux;
}

public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}

}
