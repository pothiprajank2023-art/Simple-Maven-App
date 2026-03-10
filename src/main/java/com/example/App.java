package com.example;

public class App {
    public String calculateGrade(int marks) {
        if (marks >= 90) return "S";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
}
