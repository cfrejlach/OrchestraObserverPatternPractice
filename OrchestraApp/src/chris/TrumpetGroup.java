package chris;

// TODO: Auto-generated Javadoc
/**
 * The Class TrumpetGroup.
 */
public class TrumpetGroup implements Observer{
	
	/**
	 * Update.
	 *
	 * @param sc the sc
	 */
	public void update(StateChange sc) {
		System.out.println("Notification to Trumpets: " + sc.getMessageContent());

	}
}
