package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@PropertySource("classpath:castle.properties")
public class Castle {

    @Value("${my.castle.name:East Eatch}")
    private String name;

    Knight knight;

    Castle( Knight knight, String name) {
        this.name = name;
        this.knight = knight;
    }

    @Autowired
    public Castle(@Qualifier(value = "lancelot") Knight knight) {
        this.knight=knight;
    }

    @PostConstruct
    public void build() {
        System.out.println("wybudowano zamek " + name);
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("zaraz wyburzymy zamek " + name);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + name + " zamieszkały przez rycerza " + knight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
