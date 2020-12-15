package com.hyb.java1.innnerclass;

//接口作为成员变量类型

public class Hero2 {

    private String name; // 英雄的名称
    private Skill skill; // 英雄的技能

    public Hero2() {
    }

    public Hero2(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("我叫" + name + "，开始施放技能：");
        skill.use(); // 调用接口中的抽象方法
        System.out.println("施放技能完成。");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

interface Skill {

    void use(); // 释放技能的抽象方法

}

class SkillImpl implements Skill {
    @Override
    public void use() {

        System.out.println("Biu~biu~biu~");
    }
}

class DemoGame {

    public static void main(String[] args) {
        Hero2 hero = new Hero2();
        hero.setName("艾希"); // 设置英雄的名称

        // 设置英雄技能
//        hero.setSkill(new SkillImpl()); // 使用单独定义的实现类

        // 还可以改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill);

        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {

                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });

        hero.attack();
    }

}
