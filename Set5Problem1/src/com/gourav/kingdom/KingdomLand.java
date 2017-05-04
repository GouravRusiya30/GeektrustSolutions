package com.gourav.kingdom;

public class KingdomLand implements IKingdom {
	
	private String emblem = "Panda";
	
	@Override
	public String getEmblem(){
		return this.emblem;
	}
}
