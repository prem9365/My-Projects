package game;

public class Player2 extends Player1{
	
	private int health;
	private boolean armour;
	Player2(String name, String weapon, int health,boolean armour) {
		super(name, weapon,health);
		 
		  this.armour= armour;
		  if(health>100 || health<0){
			  this.health=100;
		  }
	}
	
	@Override
	public void damageBygun1(){
	
		if(armour){
			this.health-=20;
			
			if(this.health<=0){
				this.health=0;
			}
		
			System.out.println("ARMOUR Is ON, Got Hit by Gun 1. Health reduced to 20"+"New health is :"+this.health);
		}
		if(!armour){
			this.health-=30;
			
			if(this.health<=0){
				this.health=0;
			}
			System.out.println("ARMOUR Is OFF, Got Hit by Gun 1. Health reduced to 30"+"New health is :"+this.health);
		}	
		if (this.health==0){
			System.out.println(this.getName()+"is DEAD");
		}
	}
	public void damageByGun2(){
		if(armour){
			this.health-=40;
			
			if(this.health<0){
				this.health=0;
			}
		
			System.out.println("ARMOUR Is ON, Got Hit by Gun : 2. Health reduced to 40"+"  New health is :"+ this.health);
		}
		if(!armour){
			this.health-=50;
			
			if(this.health<=0){
				this.health=0;
			}
			System.out.println("ARMOUR Is OFF, Got Hit by Gun : 2. Health reduced to 50"+"  New health is :"+ this.health);
		}
		if (this.health==0){
			System.out.println(this.getName()+"  is DEAD");
		}
		
		}

	@Override
	public void healHealth() {
		// TODO Auto-generated method stub
		if(health<=0){
			System.out.println("can't heal");
		
		}
		else if(health<50 && health>0){
			this.health=100;
			System.out.println("plr is healed");
		}
		else{	
			this.health=health;
		}	
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isArmour() {
		return armour;
	}

	public void setArmour(boolean armour) {
		this.armour = armour;
	}
	
}