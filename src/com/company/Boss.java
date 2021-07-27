package com.company;

import java.util.Random;

public class Boss {

    private int bossHealth;
    private int bossDamage;
    private int bossDefenceType;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(int bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public void changeDefenceType(){
        Random random = new Random();
        int a = random.nextInt(20)+1;
        System.out.println(bossDefenceType+a);
    }

}
