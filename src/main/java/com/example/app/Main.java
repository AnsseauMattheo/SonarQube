package com.example.app;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));

        // Volontairement une mauvaise pratique (non utilisé)
        String unused = StringUtils.reverse("SonarCloud");
    }
}
