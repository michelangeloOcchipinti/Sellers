
public class Venditori {
	
	private String nome;
	private String cognome;
	private int eta;
	private float fatturato;
	private String codVenditore;
	
	public Venditori(String nome, String cognome, int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
															}
	public String toString(){
		return nome+" "+cognome+" "+eta+" "+fatturato;
	}
	
	public void setCodVenditore(String codVenditore){
		this.codVenditore=codVenditore;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setCognome(String cognome){
		this.cognome=cognome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public void setEta(int eta){
		this.eta=eta;
	}
	
	public int getEta(){
		return eta;
	}
	
	public void setFatturato(float fatturato){
		this.fatturato=fatturato;
	}
	
	public float getFatturato(){
		return fatturato;
	}
	
	public void aggiornaFatturato(float aggiunta){
		this.fatturato=fatturato+aggiunta;
	}
	
	public void stampaVenditori(){
		
	}
}
