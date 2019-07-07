package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

//@Component
//@Scope("prototype")
public class Knight {


    private String name;

    private int age;

    private Quest quest;

    public Knight() {
        name = "Lancelot";
        age = 29;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        //  this.quest = new Quest("Uratuj księżniczkę");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

  //  @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name +
                "( " + age + " ) Zadanie: " + quest;
    }


}
