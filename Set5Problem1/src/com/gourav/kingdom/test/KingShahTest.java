package com.gourav.kingdom.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.gourav.kingdom.king.SecretMessageChecker;

/**
 * This class accepts the input and answers all the questions like:
 * Who is the ruler of Southeros?
 * Allies of King Shan? ......etc
 * @author Gourav
 *
 */
public class KingShahTest {
	
	public void findRulerOfSoutheros(String [] emblemList){
		
		boolean loopCheck = true;
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		
		String question1 = "Who is the ruler of Southeros?";
		String question2 = "Allies of King Shan?";
		String nonRequired = "Messages to kingdoms from King Shan:";
		
		Set<String> allies = new HashSet<String>();
		
		do{
			String input = kb.nextLine();
			
			if(question1.equalsIgnoreCase(input)){
				
				if(allies.size() <= 0)
					System.out.println("None");
				else{
					System.out.println("King Shah");
					
					// check for the infinite loop
					System.out.println("We have find the ruler of Southeros...");
					System.out.println("Do you want to continue? Y/N");
					String ch = kb.next();
					
					if("N".equalsIgnoreCase(ch))
						loopCheck = false;
					
					kb.nextLine();
				}
			} else if(question2.equalsIgnoreCase(input)){
				
				if(allies.size() == 0)
					System.out.println("None");
				else{
					int count=0;
					
					for(String s : allies){
						if(count < allies.size()-1)
							System.out.print(s+", ");
						else
							System.out.print(s);
						count++;
					}
					System.out.println();
					
				}
			} else if(nonRequired.equalsIgnoreCase(input)) {
				//do nothing.....continue
				
			}
			else {
				String [] str = input.split(",");
				
				SecretMessageChecker secretMessageChecker = new SecretMessageChecker();
				boolean check = false;
				String alliesName = null;
				
				str[0] = str[0].replaceAll(" ", "");
				
				if("Land".equalsIgnoreCase(str[0])){
					check = secretMessageChecker.messageCheck(str[1], emblemList[0]);
					alliesName="Land";
					
				} else if("Water".equalsIgnoreCase(str[0])){
					check = secretMessageChecker.messageCheck(str[1], emblemList[1]);
					alliesName="Water";
					
				} else if("Ice".equalsIgnoreCase(str[0])){
					check = secretMessageChecker.messageCheck(str[1], emblemList[2]);
					alliesName="Ice";
					
				} else if("Air".equalsIgnoreCase(str[0])){
					check = secretMessageChecker.messageCheck(str[1], emblemList[3]);
					alliesName="Air";
					
				} else if("Fire".equalsIgnoreCase(str[0])){
					check = secretMessageChecker.messageCheck(str[1], emblemList[4]);
					alliesName="Fire";
					
				}
				
				if(check)
					allies.add(alliesName);
			}
			
		}while(loopCheck);
	}
}
