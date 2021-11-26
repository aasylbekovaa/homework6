package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss =new Boss();
	boss.setHealth(500);
	boss.setDamage(50);
	boss.setSuperpower("wall");
	boss.weapon.setNameWeapon("m416");
	boss.weapon.setTypeWeapon("firearms");
	System.out.println(boss.getHealth() + " " + boss.getDamage()+ " " +  boss.getSuperpower() + " " +  boss.getWeapon().getNameWeapon() +" " + boss.getWeapon().getTypeWeapon());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(300);
        skeleton.setDamage(100);
        skeleton.setSuperpower("nevedimka");
        skeleton.weapon.setNameWeapon("akm");
        skeleton.weapon.setTypeWeapon("firearms");
		System.out.println(skeleton.getHealth()+ " " + skeleton.getDamage()+ " " + skeleton.getSuperpower()+ " " + skeleton.getWeapon().getNameWeapon()+ " " + skeleton.getWeapon().getTypeWeapon());



        Skeleton skeleton1 = new Skeleton();
        skeleton.setHealth(567);
        skeleton.setDamage(190);
        skeleton.setSuperpower("mag");
        skeleton.weapon.setNameWeapon("m16");
        skeleton.weapon.setTypeWeapon("firearms");
		System.out.println(skeleton.getHealth()+ " " + skeleton.getDamage()+ " " + skeleton.getSuperpower()+ " " + skeleton.getWeapon().getNameWeapon()+ " " + skeleton.getWeapon().getTypeWeapon());


    }

}
