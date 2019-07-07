package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Tournament {

    //    @Autowired
//    @Qualifier(value="percival")
//    Knight knight;
//    @Autowired
//    List<Knight> knights;
@Autowired
    Map<String,Knight> knights;

    public Tournament() {

    }

//    public void setKnight(Knight knight) {
//     //   this.knight = knight;
//    }


    public void setKnights(Map<String,Knight> knights) {
        this.knights = knights;
    }

    public void duel() {
      //  knight.setAge(knight.getAge() + 1);
    }

    @Override
    public String toString() {
        return "W turnieju bierzą udział rycerze: " + knights.entrySet()
                .stream()
                .map(stringKnightEntry -> stringKnightEntry.getKey()+stringKnightEntry.getValue())
                .collect(Collectors.joining("' "));

    }
    //   knights.stream().map(Knight::toString).collect(Collectors.joining(", "));
}
