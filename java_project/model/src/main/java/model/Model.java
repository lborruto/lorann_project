package model;

public class Model {

	public Model() {
		
	}
	public void MovecontrolRight(Player player, Model model) {
		player.setLorannX(player.getLorannX() + 10);
	}
	public void MovecontrolLeft(Player player, Model model) {
		player.setLorannX(player.getLorannX() - 10);
	}
	public void MovecontrolUp(Player player, Model model ) {
		player.setLorannY(player.getLorannY() - 10);
	}
	public void MovecontrolDown(Player player, Model model) {
		player.setLorannY(player.getLorannY() + 10);
	}
}

