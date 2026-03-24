package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableCode {

    public void doSomethingDangerous() {
        String userInput = "1 OR 1=1";
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE id = " + userInput);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
