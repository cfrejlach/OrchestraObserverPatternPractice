package chris;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MusicConductor.
 */
public class MusicConductor implements Subject{
	
	/** The observers. */
	private List<Observer> observers = new ArrayList<>();

	/**
	 * Attach.
	 *
	 * @param o the o
	 */
	public void attach(Observer o) {
		observers.add(o);
		
	}

	/**
	 * Detach.
	 *
	 * @param o the o
	 */
	public void detach(Observer o) {
		observers.remove(o);
		
	}

	/**
	 * Notify update.
	 *
	 * @param sc the sc
	 */
	public void notifyUpdate(StateChange sc) {
		for(Observer o: observers) {
			o.update(sc);
		}
		
	}
}
