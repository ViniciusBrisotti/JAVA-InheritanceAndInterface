
public class Cliente implements Autenticavel {
	private AutenticacaoUtil autenticador;	

	Cliente(){
		this.autenticador = new AutenticacaoUtil(); 	
		}
		
	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
			
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); //return no valor boolean
	}

	/*@Override
	public double getBonificacao() {
		
		return 0;
	}*/

}

