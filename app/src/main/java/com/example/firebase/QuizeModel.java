package com.example.firebase;

public class QuizeModel {
     String questions;
     String option1;
     String option2;
     String option3;
     String option4;
    String answer;

    public QuizeModel() {

    }

    public QuizeModel(String question, String op1, String op2, String op3, String op4, String ans) {
        this.questions = question;
        this.option1 = op1;
        this.option2 = op2;
        this.option3 = op3;
        this.option4 = op4;
        this.answer = ans;
    }
// Constructor and other methods

    public String getQuestion() {
        return questions;
    }

    public String getOp1() {
        return option1;
    }

    public String getOp2() {
        return option2;
    }

    public String getOp3() {
        return option3;
    }

    public String getOp4() {
        return option4;
    }

    public String getAns() {
        return answer;
    }
}
