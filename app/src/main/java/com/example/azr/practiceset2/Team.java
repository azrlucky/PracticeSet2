package com.example.azr.practiceset2;

public class Team {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public int addThree() {
        score += 3;
        return score;
    }

    public int addOne() {
        score++;
        return score;
    }

    public int subtractOne() {
        score--;
        return score;
    }

    public int resetScore() {
        score = 0;
        return score;
    }
}
