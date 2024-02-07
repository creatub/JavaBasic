package chat;
import javax.swing.*;
import java.awt.*;


public class MyChatGui extends JFrame{
	Container cp;
	String[] userInfo = { "admin", "1234" };// ID, Password
	public static void main(String[] args) {
		MyChatGui my = new MyChatGui();
		my.setSize(400,650);
		my.setVisible(true);
		
	}

}
