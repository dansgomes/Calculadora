package com.calculadora.controller;

import com.calculadora.domain.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    private Calculadora calculadora = new Calculadora();
    @GetMapping("/soma")
    public String soma (@RequestParam int x, @RequestParam int y){
        return String.valueOf(calculadora.soma(x,y));
        }
    @GetMapping("/subtracao")
    public String subtracao (@RequestParam int x,@RequestParam int y){
        return String.valueOf(calculadora.subtracão(x,y));
    }
    @GetMapping("/multiplicacao")
    public String multiplicacao (@RequestParam int x,@RequestParam int y){
        return String.valueOf(calculadora.multiplicacão(x,y));
    }
    @GetMapping("/divisao")
    public String divisao (@RequestParam double x,@RequestParam double y){
        return String.valueOf(calculadora.divisao(x,y));
    }
}
