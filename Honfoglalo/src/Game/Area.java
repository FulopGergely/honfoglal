package Game;


import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Area{
	public Label number;
	public ImageView image;
	

	
	public ImageView blue;
	public ImageView red;
	public ImageView green;
	public ImageView castle0;
	public ImageView castle1;
	public ImageView castle2;
	public ImageView castle3;
	
	
	Area(){
		
	}
	
	/*
	Area(ImageView red,ImageView blue,ImageView green,ImageView castle0, ImageView castle1, ImageView castle2, ImageView castle3){
		this.red=red;
		this.blue=blue;
		this.green=green;
		this.castle0=castle0;
		this.castle1=castle1;
		this.castle2=castle2;
		this.castle3=castle3;
	}
*/

	

	public void setColor(String a) {
		if(a == "blue") {
			//ImageLoad("b00",image);
		}
	}
	public void setArea(ImageView a) {
		this.image = a;
	}
	
	

/*
	public ImageView getBlue() {
		return blue;
	}


	public void setBlue(ImageView blue) {
		this.blue = blue;
	}

	*/
}
