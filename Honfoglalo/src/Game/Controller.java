
package Game;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class Controller implements Initializable {

	public ImageView[] a = new ImageView[20];
	
	
	@FXML
	private Button button;
	@FXML
	private ImageView area00;
	@FXML
	private ImageView area01;
	@FXML
	private ImageView area02;
	@FXML
	private ImageView area03;
	@FXML
	private ImageView area04;
	@FXML
	private ImageView area05;
	@FXML
	private ImageView area06;
	@FXML
	private ImageView area07;
	@FXML
	private ImageView area08;
	@FXML
	private ImageView area09;
	@FXML
	private ImageView area10;
	@FXML
	private ImageView area11;
	@FXML
	private ImageView area12;
	@FXML
	private ImageView area13;
	@FXML
	private ImageView area14;
	@FXML
	private ImageView area15;
	@FXML
	private ImageView area16;
	@FXML
	private ImageView area17;
	@FXML
	private ImageView area18;
	@FXML
	private ImageView area19;
	
	
	@FXML
	private void asdasd(ActionEvent event) {
		System.out.println("haho");
	}
	/*
	.button{
		-fx-effect:dropshadow(three-pass-box,black,10,0,8,10); //árnyék
		-fx-background-image: url('http://icons.iconarchive.com/icons/aha-soft/desktop-buffet/128/Pizza-icon.png');
	}
	*/
	@FXML
	public void asd() {
	Player a = new Player();
	a.asd();
	//ImageLoad("/kep/Névtelen.png", r00);
}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		 
		/*
		ImageLoad("r00.png", area00);
		
		
		ImageLoad("b00.png", b00);
		ImageLoad("g00.png", g00);
		ImageLoad("c00.png", c00);
		ImageLoad("c00.png", c00);
		ImageLoad("c00.png", c00);
		ImageLoad("c00.png", c00);
		*/
		//és így tovább
		
		a[0] = area00;
		a[1] = area01;
		a[2] = area02;
		a[3] = area03;
		a[4] = area04;
		a[5] = area05;
		a[6] = area06;
		a[7] = area07;
		a[8] = area08;
		a[9] = area09;
		a[10] = area10;
		a[11] = area11;
		a[12] = area12;
		a[13] = area13;
		a[14] = area14;
		a[15] = area15;
		a[16] = area16;
		a[17] = area17;
		a[18] = area18;
		a[19] = area19;
		
		ImageLoad("/kep/g00.png",a[0]);
		
		
		//setColor(19,1);
	  
	    
		for(int i =0;i <19;i++) {
			
		}
		
		//
		//a[0] = new area(r00, b00, g00, c00, c01, c02 ,c03);
		//a[1] = new area(r01, b01, g01, c00, c01, c02 ,c03);
		//és így tovább
		
		
		System.out.println("haho");
		
	}
	public void ImageLoad(String a, ImageView b) {
		//Image a = new Image("/red.png");
		//image00.setImage(a);
		try {
			b.setImage(new Image(a)); //ez így a bin mappa
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println("kép betöltési hiba");
			
		}
		
	}
	public void setColor(int area, int color) {
		//0-18 ig vannak területek.
		
		//0 - játékos színe, kék
		//1 - piros
		//2 - zöld
		//3 - semleges
		
		ImageLoad("/kep/r18.png",a[area]);
		
		
	}
	

}
