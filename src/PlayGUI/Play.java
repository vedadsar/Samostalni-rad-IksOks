package PlayGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GameLogic.Igrica;

/**
 * Class which creates GUI game tictactoe.
 * @author Vedad_2
 *
 */
public class Play {
	private static JButton buttons[];
	private static Igrica gameLogic;
	private static JFrame game;
	
	public static void main(String[] args) throws MalformedURLException {
	
		gameLogic = new Igrica();
		game = new JFrame();
		buttons = new JButton[9];
		game.setSize(450, 450);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setResizable(false);
		game.setLayout(new GridLayout(3, 3));
		
		ButtonHandler bh = new ButtonHandler();
		
		for(int i=0; i<9;i++){
			buttons[i] = new JButton(" ");
			buttons[i].setIcon(new ImageIcon(new URL("http://s7.postimg.org/5e86ffjrr/Nothing.jpg?noCache=1421006618")));
			buttons[i].addActionListener(bh);
			game.add(buttons[i]);
		}		
		game.setLocation(400, 300);
		game.setVisible(true);	
		
	}

	public static void restart(){
		try {
			main(null);
		} catch (MalformedURLException e) {
		}
	}
	/**
	 * Method which is reacting on pressing button on our window.
	 * Each time button is pressed class Igrica(our game logic) is called to make move
	 * and our button changes image.
	 * @author Vedad_2
	 *
	 */
	public static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource() == buttons[0]){
					buttons[0].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[0].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[0].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
				
					gameLogic.odigrajPotez(0, 0);
											
				}
				
				if(e.getSource() == buttons[1]){
					buttons[1].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[1].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[1].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
				
					gameLogic.odigrajPotez(0, 1);
				}
			
				if(e.getSource() == buttons[2]){
					buttons[2].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[2].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[2].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					
					gameLogic.odigrajPotez(0, 2);
				}
			
				if(e.getSource() == buttons[3]){
					buttons[3].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[3].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[3].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					
					gameLogic.odigrajPotez(1, 0);
				}
				
				if(e.getSource() == buttons[4]){
					buttons[4].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[4].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[4].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					gameLogic.odigrajPotez(1, 1);
				}
			
				if(e.getSource() == buttons[5]){
					buttons[5].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[5].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[5].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					
					gameLogic.odigrajPotez(1, 2);
				}
			
				if(e.getSource() == buttons[6]){
					buttons[6].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[6].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[6].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					
					gameLogic.odigrajPotez(2, 0);
				}
			
				if(e.getSource() == buttons[7]){
					buttons[7].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[7].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[7].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					gameLogic.odigrajPotez(2, 1);
				}
				
				if(e.getSource() == buttons[8]){
					buttons[8].setEnabled(false);
					if(gameLogic.getAktivniIgrac() == -1)
						buttons[8].setDisabledIcon(new ImageIcon(new URL("http://s27.postimg.org/nv7x07bm7/image.jpg?noCache=1421008196")));
					else
						buttons[8].setDisabledIcon(new ImageIcon(new URL("http://s10.postimg.org/g9r0ubu85/image.jpg?noCache=1421008321")));	
					gameLogic.odigrajPotez(2, 2);								
				}	
				
				if(gameLogic.daLiJeKraj() == true && gameLogic.nekoJePobjedio()==false){
					JOptionPane.showMessageDialog(null, "REMI");
					game.dispose();
					restart();
				}
				if(gameLogic.nekoJePobjedio() == true){
					JOptionPane.showMessageDialog(null, "Pobjednik je " +gameLogic.getPobjednik());
					game.dispose();
					restart();
				}
		} catch (Exception e1) {
		}	
	}
		
	}
}
