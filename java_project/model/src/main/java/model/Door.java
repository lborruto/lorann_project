package model;

import contract.IDoor;

public class Door implements IDoor {
	
	private int _DoorY;
	private int _DoorX;
	private boolean KeyState = true;

	public Door(){
		
		if(KeyState == false) {
			System.out.println("WINNER WINNER CHICKEN DINNER");
		}
		else if (KeyState == true) {
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

}
