package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot r7 = new Robot();
	r7.setSpeed(100);
		r7.penDown();
		r7.setPenColor(21,101,131);
		for(int i=0;i<4;i++) {
		r7.move(200);
		r7.turn(90);
		
		}
		
	}
}
