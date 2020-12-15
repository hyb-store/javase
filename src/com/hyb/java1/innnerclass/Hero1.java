package com.hyb.java1.innnerclass;

//类作为成员变量类型

// 游戏当中的英雄角色类
public class Hero1 {

    private String name; // 英雄的名字
    private int age; // 英雄的年龄
    private Weapon weapon; // 英雄的武器

    public Hero1() {
    }

    public Hero1(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack() {

        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击敌方。");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
    }
}
class Weapon {

    private String code; // 武器的代号

    public Weapon() {
    }

    public Weapon(String code) {

        this.code = code;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }
}
class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero1 hero = new Hero1();
        // 为英雄起一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        // 创建一个武器对象
        Weapon weapon = new Weapon("AK-47");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        // 年龄为20的盖伦用多兰剑攻击敌方。
        hero.attack();
    }

}
