package game;

public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	Player1(String name, String weapon, int health){
		this.name=name;
		this.weapon=weapon;
		if(health<0 || health>100){
			this.health=100;
		}
		else{
			this.health=health;
		}
	}

	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setWeapon(String weapon){
		this.weapon=weapon;
	}
	public String getWeapon(){
		return weapon;
	}
	
	public void setHealth(int health){
		this.health=health;
	}
	public int getHealth(){
		return health;
		
	}

	public void damageBygun1() {
		// TODO Auto-generated method stub
		this.health -= 30;
		if(this.health<=0){
			this.health=0;
			
		}
		System.out.println("got hit by Weapon :"+getWeapon()+"."+" Health is Reduced by 30"+ "New health is"+this.health);
		if(health<30){
			System.out.println("PLEASE  HEAL UP");
		}
		if (this.health==0){
			System.out.println(getName()+"player is Dead");
		}	
	}

	public void damageBygun2() {
		// TODO Auto-generated method stub
		this.health -= 50;
		if(this.health<=0){
			this.health=0;
			
		}
		System.out.println("got hit by gun : 2. Health is Reduced by 50"+ "  New health is"+this.health);
		
		if (this.health==0){
			System.out.println(getName()+"   player is Dead");
		}	
	}
	public void healHealth(){
		if(this.health<=0){
			System.out.println("is dead  not able to heal");
		}
		else if (this.health <50){
		this.health=100;
		System.out.println(getName()+  "is Healed to full LIFE");
		}
		else{
			this.health=health;
		    }
	}


	
	
}
