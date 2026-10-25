import java.util.Random;
import java.util.Scanner;
// vem da je koda zelo messy, js sem tudi
//-Albin
public class MStrider {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		System.out.println("Welcome Warior");
		System.out.println("Choose your weapons & equipment");
		System.out.println("1: Spear & Shield for swiftness and defence");
		System.out.println("2: Sword & Shield for offence and defence");
		System.out.println("3: Bow & arrows for offence and swiftness");
		System.out.println("Please enter the number of your choice: ");
		System.out.print(">");
		
		int choice = input.nextInt();
		int playerHp = 100;
		int potionCount = 3;
		int coward = 0;
		int playerStr = 10;
		int playerSpd = 30;
		int playerDef = 30;

		if (choice == 1) {
			System.out.println("Speed and defence, I would have chosen this myself");
			playerSpd = 50;
			playerStr = 20;
			playerDef = 50;
		} else if (choice == 2) {
			System.out.println("Take a hit and hit back harder? Good choice");
			playerStr = 30;
			playerSpd = 10;
			playerDef = 50;
		} else if (choice == 3) {
			System.out.println("Hit hard and evade? Excellent");
			playerStr = 30;
			playerSpd = 60;
			playerDef = 10;
		} else {
			System.out.println("You wish to take nothing? I won't stop you");
			playerStr = 10;
			playerSpd = 10;
			playerDef = 10;
		}
		
		System.out.println("Which room will you go into?");
		System.out.println("Room 1 contains a basilisk who is strong and tough");
		System.out.println("Room 2 contains a dragon that is strong and fast");
        System.out.println("Room 3 contains Cerberus who is tough and fast");
		System.out.print(">");
		
		String monster = "Coward slayer 3000" ;
        
		int roomChoice = input.nextInt ();
		int monsterHp = 300;
		int monsterStr = 30;
		int	monsterSpd = 10;
		int	monsterDef = 30;
			
		if (roomChoice == 1) {
			monsterStr = 30;
			monsterSpd = 10;
			monsterDef = 30;
			monster = "the Basalisk";
			System.out.println("Basalisk it is then");
			System.out.println("Good luck");
			
		} else if (roomChoice == 2) {
			monsterStr = 30;
			monsterSpd = 30;
			monsterDef = 10;
			monster = " the Dragon";
			System.out.println("Dragon it is then");
			System.out.println("Good luck");
		} else if (roomChoice == 3) {
			monsterStr = 10;
			monsterSpd = 30;
			monsterDef = 30;
			monster = "Cerberus";
			System.out.println("Cerberus awaits you");
			System.out.println("Good luck");
		} else {
			System.out.println("Running away? You are a coward and do not deserve to live");
		    coward = 1;
			playerHp = 0;
			playerStr = 1;
			playerSpd = 100;
		}
		while (playerHp > 0 && monsterHp > 0) {
		    System.out.println("Your stats:");
		    System.out.println("Hp: " + playerHp);
		    System.out.println("Str: " + playerStr);
		    System.out.println("Spd: " + playerSpd);
		    System.out.println("Def: " + playerDef);
		    System.out.println("Monster's stats:");
		    System.out.println("Hp: " + monsterHp);
		    System.out.println("Str: " + monsterStr);
		    System.out.println("Spd: " + monsterSpd);
		    System.out.println("Def: " + monsterDef);
			System.out.println("What will you do?");
			System.out.println("press 1 to attack");
			System.out.println("press 2 to heal with potions");
			System.out.println("press 3 to evade");
			System.out.println("press 4 to skip yout turn");
			System.out.print(">");
		
			int action = input.nextInt ();
			
			int hitChan = 100 - playerSpd / 2 ;
			
			if (action == 1) {
				int hitsFor = ((random.nextInt(playerStr + 1) + playerStr) * (100 - monsterDef)) / 100;
				monsterHp -= hitsFor;
				System.out.println("You hit " + monster + " for " + hitsFor + " damage!");
			} else if (action == 2) {
				if (potionCount > 0) {
					int healsFor = random.nextInt(31) + 15;
					playerHp = Math.min(100, playerHp + healsFor);
					potionCount --;
					System.out.println("You heal for " + healsFor + " HP!");
				    System.out.println("You healed to " + playerHp);
					
				} else {
					System.out.println("You haven't a single potion");
					continue;
				}
				
			} else if ( action == 3 ) {
				hitChan -= playerSpd * 2;
				System.out.println("Your chance to evade is now " + hitChan );
				
			} else {
				System.out.println("You choose to do nothing?");
			}

			int monsterHit = (((random.nextInt(monsterStr + 1) + monsterStr) * (100 - playerDef)) / 100);
			int monsterHitChance = 100 - monsterSpd / 2;
			int defense = random.nextInt(playerDef + 1) ;
			if (random.nextInt(100) < monsterHitChance) {
				int damage = Math.max(0, monsterHit - defense);
				playerHp -= damage;
				System.out.println(monster + " hits you for " + damage + " damage!");
			} else {
				System.out.println(monster + " missed!");
			}

		
		}
		
		if (playerHp <= 0) {
			System.out.println("You were defeated");
		} else {
			System.out.println("You win");
		}
	}
		

		
    }

