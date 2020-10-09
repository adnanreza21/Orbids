package com.amazing.orbids.kuis;

public class Question {

    public String mQuestions[] = {
            "",
            "",
            "",
            "",
            "",
    };

    private String mChoices[][] = {

            {"","","","",""},
            {"","","","",""},
            {"","","","",""},
            {"","","","",""},
            {"","","","",""},


    };
    private String mCorrectAnswer[] = {

           "",
           "",
           "",
           "",
           "",
           "",
           "",

    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
