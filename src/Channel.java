import java.util.ArrayList;
import java.util.List;

// Observable
public class Channel {
	public List<Subscriber> subscribers = new ArrayList<>();

	// Añadir subscriptor
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	// Eliminar subscriptor
	public void removeSubscriber(Subscriber suscriber) {
		subscribers.remove(suscriber);
	}

	// Notificar
	public void notifySubscribers(String msg) {
		for(Subscriber sub : subscribers) {
			sub.notify(msg);
		}
	}

	public void uploadVideo() {
		/**
		 * Lógica de subir videos
		 * ...
		 */

		// Se notifican a los suscriptores
		this.notifySubscribers("Nuevo video subido. Ven a verlo");
	}
}
