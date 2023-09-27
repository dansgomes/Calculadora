package com.calculadora;

import com.calculadora.domain.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();

    @Test
    public void somaTest (){
        Assertions.assertEquals(4,calculadora.soma(2,2));
    }
    @Test
    public void subtracaoTest (){
        Assertions.assertEquals(0,calculadora.subtracão(2,2));
    }
    @Test
    public void divisaoTest (){
        Assertions.assertEquals(1,calculadora.divisao(2,2));
    }
    @Test
    public void multiplicacãoTest (){
        Assertions.assertEquals(9,calculadora.multiplicacão(3,3));
    }
}
