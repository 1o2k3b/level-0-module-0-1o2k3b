package _04_amazing_games._1_scary_maze;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener, ActionListener {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = false;
	
	boolean started = false;
	BufferedImage maze;
	int frameWidth = 500;
	int frameHeight = 500;
	Timer resetTimer;

	ScaryMaze() throws Exception {
		
		//1. Use this online tool (https://www.pixilart.com/) to make a maze image. Size = 500x500
		//   The maze must be drawn using 4 different colors, one each for: START, END, BACKGROUND, and path.
		//   Download your maze image to the computer desktop. 
		//   Drag and drop the image into the _04_amazing_games._1_scary_maze package 
		
		
		//2. Change the line of code below so that it uses YOUR maze's file name
		maze = ImageIO.read(getClass().getResource("lostmaze.png"));
		
		
		//3. Run the program. Do you see your maze? Don't continue until you do.
		
		
		// Leave this code here! It will allow the program to know when the mouse moves. 
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);	
		
		//4. Print the mouseColor variable (Hint: use syso)
		System.out.println(mouseColor);
		//5.  Run your program and move your mouse over the START COLOR. A number will be printed to the console
		
		
		int startColor=-8579266;
		//6. Change the value of this startColor variable to the number printed in the previous step. 
		
		
		// Leave this code here!
		// It makes sure the game will not start until the mouse has visited the start area.
		if (!started  && mouseColor==startColor) {
			started = true;
		}
		
		
		//7. Make a new int variable for the background color of the maze

		int background = -59580;
		//8. Run the program and move the mouse over the BACKGROUND COLOR. 
		//   Use the number that is printed to the console to set the background color variable 
		
		
		
		if (started) {
		
		
			//9. If the mouse falls off the path (which means it is on the background color)
			//		call the scare method - scare();
			if (background == mouseColor) {
				scare();
			}
			//13.  If the mouse is on the end color, pop up a message to tell them they won!
			//    (you will need to get the number of the END COLOR by moving the mouse over it)
			if (mouseColor == -12232092){
				win();	
			}
					
			
		}	
	}

	private void scare() {
		
		//Scare your player with scary messages, sounds and pictures
		
		System.out.println("Cackle!");
		
		if (canPlaySounds) {

			/**********  PLAY A SOUND ***************/
			//10. Find a scary sound and put it in the _04_amazing_games._1_scary_maze package (where you put your maze picture). 
			//    You can find a sound on freesound.org. Log in as leagueofamazing/code4life.		
			//11. Play the scary sound. Hint: use the playScarySound method with the name of your sound file		

			
		}	
		/**********  SHOW A PICTURE ***************/
		//-12232092 finish line color
		
		//12. Find a scary image and drop it into the _04_amazing_games._1_scary_maze package. 
		//    Use the showScaryImage method below and send it the name of your picture file
		showScaryImage("ew scary.jpg");
		frameWidth = 1300;
		frameHeight = 956;
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		resetGame();
	}
	
	private void win() {
		System.out.println("yyyaaaaayyyyyyyyyy!!!!!!!!!!!!");
		
		showScaryImage("win.jpg");
		frameWidth = 720;
		frameHeight = 360;
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		resetGame();
	}
	
	private void resetGame(){
		resetTimer = new Timer(5000,this);
		resetTimer.start();
	}

	
	/**********  DO NOT CHANGE THE CODE BELOW THIS LINE ***************/
	
	private void playScarySound(String soundName) {
		File sound = new File("src/_04_amazing_games/_1_scary_maze/"+soundName);
		if (sound.exists()) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}
 		}
		else {
			System.out.println("File does not exist");
		}
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Could not find this image: " + imageName);
		}
		repaint();
		
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}
	
	JFrame frame = new JFrame("Scary Maze");
	
	@Override
	public void run() {
		
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		resetTimer.stop();
		started = false;
		showScaryImage("lostmaze.png");
		frameWidth = 500;
		frameHeight = 500;
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
	}

}



