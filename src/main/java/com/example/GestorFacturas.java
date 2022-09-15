package com.example;

public class GestorFacturas {

    CalculatorService calculadora;

    public GestorFacturas(CalculatorService calculadora){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculadora = calculadora;
    }
}
