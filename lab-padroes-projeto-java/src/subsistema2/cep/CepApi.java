package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	public CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Mogi das Cruzes";
	}
	
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}
