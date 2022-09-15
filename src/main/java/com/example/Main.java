package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calculator = (CalculatorService) context.getBean("calculatorService");



        String texto = calculator.holaMundo();
        //System.out.println(texto);

        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");

        System.out.println(gestor.calculadora.holaMundo());
    }
}
