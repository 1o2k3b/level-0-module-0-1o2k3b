import javax.swing.*;

public class WarCards {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel playerOne = new JLabel();
	JLabel playerTwo = new JLabel();
	JLabel OneCards = new JLabel();
	JLabel TwoCards = new JLabel();
	JLabel Fight = new JLabel();
	public void setup() {
		frame.setVisible(true);
	frame.setSize(250, 600);
	frame.add(panel);
	
	panel.add(playerOne);
	panel.add(playerTwo);
	panel.add(OneCards);
	panel.add(TwoCards);
	panel.add(Fight);
	panel.setLayout(null);
	
	playerOne.setBounds(100, 500, 50, 100);
	playerOne.setOpaque(true);
	playerOne.setText("card");
	
	
	}
}
