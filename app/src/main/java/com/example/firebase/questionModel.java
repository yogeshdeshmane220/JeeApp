package com.example.firebase;

public class questionModel {
    String questions,option1,option3,option2,option4,answer;

    public questionModel() {

    }

    public questionModel(String questions, String option1, String option2, String option3, String option4, String answer) {
        this.questions = questions;
        this.option1 = option1;
        this.option3 = option3;
        this.option2 = option2;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getQuestion() {
        return questions;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }
}
