package com.clockworkjava.kursspring.domain;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Knight;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastleTest {
    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle( knight,"Castle Black");
        String except = "Znajduje się tu zamek o nazwie Castle Black zamieszkały przez rycerza Rycerz o imieniu null( 0 ) Zadanie: uratuj księżniczkę";
        assertEquals(except, castle.toString());
    }
}
