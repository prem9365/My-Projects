package game;

import java.util.Scanner;

public class SimpleGame {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the player Name ::");
	String name=sc.next();
	System.out.println("Enter Weapon :: ");
	String weapon =sc.next();
	
	

	
	Player2 p2=new Player2(name,weapon,100,false);
	System.out.println(p2.getHealth());
	p2.damageByGun2();
	
	p2.healHealth();
	System.out.println(p2.getHealth());
	
}
}
