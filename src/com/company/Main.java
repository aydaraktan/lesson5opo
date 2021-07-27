package com.company;

public class Main {

    public static void main(String[] args) {

        Hero hero =new Hero(250,20,20);
        System.out.println("Здоровье героя: " + hero.heroHealth);
        System.out.println("Урон от героя: " + hero.heroDamage);
        System.out.println("Суперудар героя: " + hero.heroAttackType);
        System.out.println("___________________________________");

        Boss boss = new Boss();
        boss.setBossHealth(400);
        boss.setBossDamage(50);
        boss.setBossDefenceType(50);
        System.out.println("Здоровье босса: " + boss.getBossHealth());
        System.out.println("Урон от босса: " + boss.getBossDamage());
        System.out.println("Здоровье босса: " + boss.getBossDefenceType());
        System.out.print("Тип защиты: ");boss.changeDefenceType();


    }
}