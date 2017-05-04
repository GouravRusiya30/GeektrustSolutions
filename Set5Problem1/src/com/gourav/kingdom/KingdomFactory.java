package com.gourav.kingdom;

public class KingdomFactory {
	
		//use getKingdom method to get object of type Kingdom 
	   public IKingdom getKingdom(String kingdomType){
	      if(kingdomType == null){
	         return null;
	      }		
	      if(kingdomType.equalsIgnoreCase("Air")){
	         return new KingdomAir();
	         
	      } else if(kingdomType.equalsIgnoreCase("Fire")){
	         return new KingdomFire();
	         
	      } else if(kingdomType.equalsIgnoreCase("Ice")){
	         return new KingdomIce();
	         
	      } else if(kingdomType.equalsIgnoreCase("Water")){
		         return new KingdomWater();
		         
		  } else if(kingdomType.equalsIgnoreCase("Land")){
		         return new KingdomLand();
		         
		  }
	      
	      return null;
	   }
}
