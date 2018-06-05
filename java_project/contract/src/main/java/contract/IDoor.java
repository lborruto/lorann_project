package contract;

public interface IDoor {
	
	public void verifDoor();
	
	public int get_DoorY();


	public void set_DoorY(int _DoorY);


	public int get_DoorX();


	public void set_DoorX(int _DoorX);
	
	public boolean isKeyState();
	
	public void setKeyState(boolean keyState);


}
