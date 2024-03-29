
public class Jogador {

	public String nome;
	public int numeroCamisa;
	public boolean bola;
	
	//Construtor	
	public Jogador (String nome, int numeroCamisa){
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
	}
	
	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	
	public boolean isBola() {
		return bola;
	}

	public void setBola(boolean bola) {
		this.bola = bola;
	}
	
	//M�todos
	
	public void passeBola(Jogador companheiro){
		if (bola){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	public void roubarBola(Jogador adversario){
		if (!bola){
			this.bola = true;
			adversario.bola = false;
		}
	}
}
                                                                                                                                                                                                                             