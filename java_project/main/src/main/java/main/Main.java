package main;
import java.awt.Window;

import javax.swing.JFrame;

import controller.controller;
import model.BDD;
import model.Catch;

public abstract class Main extends JFrame {

    public static void main(final String[] args) {
    	//BDD bdd = new BDD();
    	
    	//Window _window = new view.Window();

		//Catch _catch = new Catch();
    	
    	controller ctrl = new controller();
    }

}
