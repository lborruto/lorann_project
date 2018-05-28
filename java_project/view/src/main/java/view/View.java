package view;

import java.awt.Frame;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import controller.IController;
import model.IModel;

public class View extends JFrame {
	
	private String title;

	private final Panel _panel;
	private View() {
		_panel = new Panel(null);
	}
	
	public void View(IModel model, String title) {
		
	}
	
	public IModel getModel() {
		return null;
		
	}
	
	public IController getController() {
		return null;
		
	}
	
	public void setTitle(String title) {
		
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		
	}

}
