import se.lth.cs.window.SimpleWindow;

public class ShapeListTest {
	public static void main(String[] args) {
	    	SimpleWindow w = new SimpleWindow(600, 600, "ShapeListTest");
	    	ShapeList shapes = new ShapeList();
	    	shapes.insert(new Square(100, 300, 100));
	    	shapes.insert(new Triangle(400, 200, 100));
	    	shapes.insert(new Circle(400, 400, 50));
	    	shapes.insert(new Square(450, 450, 50));
	    	shapes.insert(new Square(200, 200, 35));

	    	shapes.draw(w);
	    	
	    	
	    	while (true) {
	    		
	    		w.waitForMouseClick();
	    		Shape sh= shapes.findHit(w.getMouseX(), w.getMouseY());
	    		
	    		if(sh != null) {
	    			w.waitForMouseClick();
	    			sh.moveToAndDraw(w, w.getMouseX(), w.getMouseY());
	    		}
	
	    		
//	    		w.waitForMouseClick();
////	    		Shape MyShape= shapes.findHit(w.getMouseX(), w.getMouseY());
//	    		Shape sh= (shapes.findHit(w.getMouseX(), w.getMouseY()));
//	    		
//	    		if(sh!= null ) {
//	    			w.waitForMouseClick();
//	    			sh.moveToAndDraw(w, w.getMouseX(), w.getMouseY());
//	    		}
	    	}
	}
}