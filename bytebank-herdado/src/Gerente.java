public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha); //Retorna valor booleano
		}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	
	}

}
