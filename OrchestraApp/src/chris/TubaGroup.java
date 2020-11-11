package chris;

// TODO: Auto-generated Javadoc
/**
 * The Class TubaGroup.
 */
public class TubaGroup implements Observer{
	
	/**
	 * Update.
	 *
	 * @param sc the sc
	 */
	public void update(StateChange sc) {
		System.out.println("Notification to Tubas: " + sc.getMessageContent());

	}
}
