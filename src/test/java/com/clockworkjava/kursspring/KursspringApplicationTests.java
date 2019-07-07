package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KursspringApplicationTests {
    @Autowired
    Knight knight;

    @Autowired
    Castle castle;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCastle() {
        String except = "Znajduje się tu zamek o nazwie Castle Black zamieszkały przez rycerza Rycerz o imieniu null( 0 ) Zadanie: uratuj księżniczkę";
        assertEquals(except, castle.toString());

    }

}
