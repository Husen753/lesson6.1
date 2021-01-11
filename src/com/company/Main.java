package com.company;

public class Main {

    public static void main(String[] args) {
        Boss snaike = new Boss();
        snaike.setHealth(500);
        snaike.setDamage(50);

        Weapon avtomat = new Weapon();
        avtomat.setName("M416");
        avtomat.setTypeWeapon("AutoVint");

        snaike.setWeapon(avtomat);

        System.out.println("Boss " + snaike.getHealth() + " " + snaike.getDamage() + " "
                + snaike.getWeapon().getName() + " " + snaike.getWeapon().getTypeWeapon());
    }
}
