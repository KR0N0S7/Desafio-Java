import Facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//Testes relacionados ao Design Pattern Strategy		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Testes relacionados ao Design Pattern Facade
		Facade facade = new Facade();
		facade.migrarCliente("Regina", "089202000");
	}

}
