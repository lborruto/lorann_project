package model;

import contract.IPurse;
/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */
public class Purse implements IPurse {
/**
 * Not implemented yet, item to catch
 */

	private int _PurseY;
	private int _PurseX;

	public Purse(){
		
	}
	
	public int get_PurseY() {
		return _PurseY;
	}


	public void set_PurseY(int _PurseY) {
		this._PurseY = _PurseY;
	}


	public int get_PurseX() {
		return _PurseX;
	}


	public void set_PurseX(int _PurseX) {
		this._PurseX = _PurseX;
	}
	
	
}
