import java.util.ArrayList;

import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	private ArrayList<Shape>shapes;



	public ShapeList() {
		shapes= new ArrayList<Shape>();
	}
	
	//lägg en figur
	public void insert(Shape sh) {
		shapes.add(sh);

	}
	//rita figurerna
	public void draw(SimpleWindow w) {
		for(int i=0; i<shapes.size(); i++) {
			shapes.get(i).draw( w);
		}	
	}

	// Tar reda på en figur som är nära xc,yc.
			// Om flera figurer ligger nära så returneras den första som hittas.
			// Om ingen figur ligger nära returneras null.
	public Shape findHit(int xc, int yc) {
		for(int i=0; i<shapes.size(); i++) {
			if(shapes.get(i).near(xc, yc) == true) {
				return shapes.get(i);
			}
		}
		return null;
	}
}
