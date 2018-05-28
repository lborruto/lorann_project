package controller;

import java.awt.event.KeyEvent;

import javax.lang.model.element.Element;

import controller.Tick.Controller;
import model.IModel;
import view.IView;

public class Controller {
	
	private Tick _tick;
	
	private Thread thread;
	
	public void controller(IView view, IModel model) {
		
	}
	
	public void initPathFinder() {
		
	}
	
	
	public void startTick () {
	}
	
	
	public void update() {
	}
	
	
	public void setView(IView view) {
	}
	
	
	public void setModel(IModel model) {
		
	}
	
	
	public IView getIView() {
		return null;
	}
	
	
	public IModel getImodel() {
		return null;
	}
	
	
	public Element getElement(int x, int y) {
		return null;
	}
	
	
	public boolean isBlocked(int x, int y) {
		return false;
		
	}
	
	
	public void keyEvent(KeyEvent event) {
		
	}
	
	
	public void move(int action, TypeEntite typeEntite, IEntite entite) {
		
	}
	
	
	public void action(int action) {
		
	}

	
}
