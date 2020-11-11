package chris;

// TODO: Auto-generated Javadoc
/**
 * The Class MainOrchestra.
 */
public class MainOrchestra {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TromboneGroup tromboneGp = new TromboneGroup();
		TrumpetGroup trumpetGp = new TrumpetGroup();
		TubaGroup tubaGp = new TubaGroup();
		
		MusicConductor conductor = new MusicConductor();
		
		conductor.attach(tromboneGp);
		conductor.attach(trumpetGp);
		conductor.attach(tubaGp);
		
		conductor.notifyUpdate(new StateChange("Appassionato"));
		
		conductor.detach(tromboneGp);
		
		conductor.notifyUpdate(new StateChange("Cresendo"));
		
		conductor.attach(tromboneGp);
		conductor.detach(tubaGp);
		conductor.detach(trumpetGp);
		
		conductor.notifyUpdate(new StateChange("Trombone Solo!!!!!"));
	}

}
