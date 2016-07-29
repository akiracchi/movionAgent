package jp.movion.akira;

import org.aiwolf.client.base.player.AbstractRoleAssignPlayer;

public class MovionRoleAssignPlayer extends AbstractRoleAssignPlayer {

	@Override
	public String getName() {
		return "movion";
	}

	public MovionRoleAssignPlayer() {
		setSeerPlayer(new MovionSeer());
	}
}
