package com.example.lottogame;

import java.util.Date;

public class GameResult {


    private  int userN1;  //الرقم ا1 الذي اختاره الزبون
    private  int userN2; //الرقم 2 الذي اختاره الزبون
    private  int userN3;// الرقم 3 الذي اختاره الزبون
    private  int randN1;// العدد العشوائي الاول
    private  int randN2;//العدد العشولئي الثاني
    private int randN3;// العدد العشوائي الثالت
    private Date gameDate;// ناريخ اللعبة


    private  int resutl;

    public GameResult(int userN1, int userN2, int userN3, int randN1, int randN2, int randN3, Date gameDate, int resutl) {
        this.userN1 = userN1;
        this.userN2 = userN2;
        this.userN3 = userN3;
        this.randN1 = randN1;
        this.randN2 = randN2;
        this.randN3 = randN3;
        this.gameDate = gameDate;
        this.resutl = resutl;
    }

    public int getUserN2() {
        return userN2;
    }

    public void setUserN2(int userN2) {
        this.userN2 = userN2;
    }

    public int getResutl() {
        return resutl;
    }

    public void setResutl(int resutl) {
        this.resutl = resutl;
    }

    public GameResult() {
    }

    public int getUserN1() {
        return userN1;
    }

    public void setUserN1(int userN1) {
        this.userN1 = userN1;
    }

    public int getIserN2() {
        return userN2;
    }

    public void setIserN2(int iserN2) {
        this.userN2 = iserN2;
    }

    public int getUserN3() {
        return userN3;
    }

    public void setUserN3(int userN3) {
        this.userN3 = userN3;
    }

    public int getRandN1() {
        return randN1;
    }

    public void setRandN1(int randN1) {
        this.randN1 = randN1;
    }

    public int getRandN2() {
        return randN2;
    }

    public void setRandN2(int randN2) {
        this.randN2 = randN2;
    }

    public int getRandN3() {
        return randN3;
    }

    public void setRandN3(int randN3) {
        this.randN3 = randN3;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "userN1=" + userN1 +
                ", iserN2=" + userN2 +
                ", userN3=" + userN3 +
                ", randN1=" + randN1 +
                ", randN2=" + randN2 +
                ", randN3=" + randN3 +
                ", gameDate=" + gameDate +
                '}';
    }
}
