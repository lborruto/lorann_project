package controller;

import view.Panel;
import view.Window;
import java.awt.event.KeyEvent;

import model.Model;
import model.Player;

public class controller {
	
	//private Window window;

	public controller() {
		this.run();
		
	}
	public void Move(KeyEvent evt, Player player, Model model) {
		
		if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
			model.MovecontrolRight(player , model) ;
			//System.out.print("ZUCC");
		}

		if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
			model.MovecontrolLeft(player , model) ;
			//System.out.print("ZUCC");

		}

		if (evt.getKeyCode() == KeyEvent.VK_UP) {
			model.MovecontrolUp(player , model) ;
			//System.out.print("ZUCC");

		}

		if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
			model.MovecontrolDown(player , model) ;
			//System.out.print("ZUCC");

	} 

}
	public void run() {
		Window window = new Window();
		}
	}
