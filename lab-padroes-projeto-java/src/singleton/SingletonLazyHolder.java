package singleton;
/**
 * Singleton "LazyHolder"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author KR0N0S
 *
 */


public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();		
	}

	public SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
