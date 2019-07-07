package com.clockworkjava.kursspring.config;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.DuelingKnight;
import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {

    @Autowired
    Quest quest;

    @Bean(name = "lancelot")
    @Primary
    //@Scope("prototype")
    public Knight lancelot() {
        Knight lancelot = new Knight("Lancelot", 29);
        lancelot.setQuest(quest);
        return lancelot;
    }
    @Bean(name = "percival")
    //@Scope("prototype")
    public Knight createKnightBean() {
        Knight percival = new Knight("Percival", 25);
        percival.setQuest(quest);
        return percival;
    }
//    @Bean(name = "percival")
//    public DuelingKnight createKnight(){
//        DuelingKnight duelingKnight = new DuelingKnight("Percival",25);
//        duelingKnight.setQuest(quest);
//        return duelingKnight;
//    }
//
//    @Bean(name = "zamek", initMethod = "build", destroyMethod = "tearDown")
//    @Value("${my.castle.name:East Eatch}")
//    public Castle castle(String name) {
//        Castle castle = new Castle(knight());
//        castle.setName(name);
//
//        return castle;
//    }



}
