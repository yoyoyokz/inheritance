
public class CompteCheque extends CompteBanquaire {
	private double decouvertAutorise;

	public CompteCheque(double solde, double decouvertAutorise) {
		super(solde);
		this.decouvertAutorise = decouvertAutorise;
	}

	public CompteCheque(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	void retirer (double montant)
	{
		if (getSolde()+decouvertAutorise>=montant)
		{
			setSolde(getSolde() - montant);
			
		}
	}
	void imprimehistoriqueCheque()
	{
		System.out.println(""+super.toString());
	}



}
