package com.example;

public class App {
    public static void main(String[] args) {
        String aws_secret_access_key = "AKIAIOSFODNN7EXAMPLE";
        String github_token = "ghp_abcdefghijklmnopqrstuvwxyz1234567890";
        String api_key = "1234567890abcdef1234567890abcdef";
        System.out.println("Starting Sample Security Project...");
        VulnerableCode vc = new VulnerableCode();
        vc.doSomethingDangerous();

        SecretDemo sd = new SecretDemo();
        sd.printSecret();
    }
}
