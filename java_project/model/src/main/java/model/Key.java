package model;

import contract.IKey;

public class Key implements IKey{
	
	private int _KeyY;
	private int _KeyX;
	

	public Key(){
		
	}
	
	public int get_KeyY() {
		return _KeyY;
	}


	public void set_KeyY(int _KeyY) {
		this._KeyY = _KeyY;
	}


	public int get_KeyX() {
		return _KeyX;
	}


	public void set_KeyX(int _KeyX) {
		this._KeyX = _KeyX;
	}

}
