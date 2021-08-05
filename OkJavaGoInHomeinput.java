import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHomeinput {
    // parameter, 매개변수
	public static void main(String[] args) {
		
		
	//	String ID = JOptionPane.showInputDialog("Enter a ID"); 
	//	String bright = JOptionPane.showInputDialog("Enter a Bright level");
		String ID = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(ID);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(ID);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(ID + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(ID + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(ID+" / MoodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // str를 실수로
		moodLamp.on();
	}

}
