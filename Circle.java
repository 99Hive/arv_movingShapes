 import javax.swing.text.BadLocationException;

import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape {

	 int rad;

	 public Circle(int x, int y, int rad) {
		super(x,y);
		this.rad= rad;
	}
	
	public void draw(SimpleWindow w) {
		w.moveTo(x+rad, y);
		
		for(int i=1; i<=360; i++) {
			
			double horn= i * (2 * Math.PI / 90);
			
			w.lineTo((int) Math.round(x + rad * Math.cos(horn)),
					(int) Math.round(y + rad * Math.sin(horn)));
		}
	}
}
