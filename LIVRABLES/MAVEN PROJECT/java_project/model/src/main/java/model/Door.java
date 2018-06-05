package model;

import contract.IDoor;
import view.Lorann;
/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */
public class Door implements IDoor {
	/**
	 * 	Instanciate door to open and finish level
	 */
	private int _DoorY;
	private int _DoorX;
	public boolean KeyState = true;

	public Door(){
				
	}
	
	public void verifDoor() {
		
		if(!KeyState) {
			System.out.println("WINNER WINNER CHICKEN DINNER");
		}
		else if (KeyState) {
			System.out.println("NOOB EZ GAME");

		}
		
	}
	
	public int get_DoorY() {
		return _DoorY;
	}


	public void set_DoorY(int _DoorY) {
		this._DoorY = _DoorY;
	}


	public int get_DoorX() {
		return _DoorX;
	}


	public void set_DoorX(int _DoorX) {
		this._DoorX = _DoorX;
	}
	
	public boolean isKeyState() {
		return KeyState;
	}

	public void setKeyState(boolean keyState) {
		KeyState = keyState;
	}

}
