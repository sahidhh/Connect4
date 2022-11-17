module com.example.connect4 {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.myfirstgame.connectfour to javafx.fxml;
	exports com.myfirstgame.connectfour;
}