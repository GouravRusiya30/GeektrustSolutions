package com.gourav.kingdom.test;

import com.gourav.kingdom.IKingdom;
import com.gourav.kingdom.KingdomFactory;

public class KingdomPattern {

	public static void main(String[] args) {
		
		KingdomFactory kingdomFactory = new KingdomFactory();
		
		String [] emblemList = new String[5];
		
		IKingdom kingdom1 = kingdomFactory.getKingdom("Land");
		emblemList[0] = kingdom1.getEmblem();
		
		IKingdom kingdom2 = kingdomFactory.getKingdom("Water");
		emblemList[1] = kingdom2.getEmblem();
		
		IKingdom kingdom3 = kingdomFactory.getKingdom("Ice");
		emblemList[2] = kingdom3.getEmblem();
		
		IKingdom kingdom4 = kingdomFactory.getKingdom("Air");
		emblemList[3] = kingdom4.getEmblem();
		
		IKingdom kingdom5 = kingdomFactory.getKingdom("Fire");
		emblemList[4] = kingdom5.getEmblem();
		
		// emblemList => {"Land", "Water", "Ice", "Air", "Fire"}
		
		
		// calling our action class....;)
		KingShahTest kingShahTest = new KingShahTest();
		kingShahTest.findRulerOfSoutheros(emblemList);
		
	}

}
