package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemDepartament;

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemDepartamentAction() {
		System.out.println("menuItemDepartament");
	}
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("menuItemSeller");
	}
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("menuItemAbout");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
