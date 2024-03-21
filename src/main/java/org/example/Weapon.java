package org.example;

public enum Weapon {
    SWORD(18, 1.5),
    AXE(28, 2.8),
    MAGIC(38, 8.8);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }


}