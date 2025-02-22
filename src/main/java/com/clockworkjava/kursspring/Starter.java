package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("starter")
@Scope
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);
        tournament.duel();
        System.out.println(tournament);
       // System.out.println(castle);


    }
}
