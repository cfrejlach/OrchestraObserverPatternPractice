package chris;

// TODO: Auto-generated Javadoc
/**
 * The Interface Subject.
 */
public interface Subject {
	
	 	/**
	 	 * Attach.
	 	 *
	 	 * @param o the o
	 	 */
	 	public void attach(Observer o);
		
		/**
		 * Detach.
		 *
		 * @param o the o
		 */
		public void detach(Observer o);
		
		/**
		 * Notify update.
		 *
		 * @param m the m
		 */
		public void notifyUpdate(StateChange m);
}
