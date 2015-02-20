import java.util.ArrayList;
import java.util.List;


public class Compra {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void finalizarCompra(Produto produto) {
		notificar(produto);
	}

	private void notificar(Produto produto) {
		for (Observer observer : observers) {
			observer.efetuarCompra(produto);
		}
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
}
