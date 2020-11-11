package chris;

// TODO: Auto-generated Javadoc
/**
 * The Class TromboneGroup.
 */
public class TromboneGroup implements Observer{
	
	/**
	 * Update.
	 *
	 * @param sc the sc
	 */
	public void update(StateChange sc) {
		System.out.println("Notification to Trombones: " + sc.getMessageContent());

	}
}
