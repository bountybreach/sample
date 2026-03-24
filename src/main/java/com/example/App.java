package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting Sample Security Project...");
        VulnerableCode vc = new VulnerableCode();
        vc.doSomethingDangerous();

        SecretDemo sd = new SecretDemo();
        sd.printSecret();
    }
}
