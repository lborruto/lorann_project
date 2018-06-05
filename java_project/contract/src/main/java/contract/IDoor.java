package contract;
/**
 * 
 * @author Guillaume Woreth, Luca Borruto, Ahmed Ben Mbarek
 *
 */
public interface IDoor {
	/**
	 * Link Door to other classes
	 */
	public void verifDoor();
	
	public int get_DoorY();


	public void set_DoorY(int _DoorY);


	public int get_DoorX();


	public void set_DoorX(int _DoorX);
	
	public boolean isKeyState();
	
	public void setKeyState(boolean keyState);


}
