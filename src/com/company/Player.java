package com.company;

public class Player {

    String name;
    int score;
    String marker;

    Player(String name, String marker){
        this.name = name;
        this.marker = marker;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }


    public String getMarker() {
        return marker;
    }

    public void increaseScore(){
        this.score++;
    }
}
