package com.SpringSiraj;

import com.SpringSiraj.library.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from Gradle project.. ");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(20, 30));
    }
}