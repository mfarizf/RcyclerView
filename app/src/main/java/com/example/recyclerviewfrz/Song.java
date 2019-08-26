package com.example.recyclerviewfrz;

public class Song {
    private String name,singer,year;
    private int pics, rank;

    public Song(String name, String singer, int rank, int pics){
        this.name = name;
        this.singer = singer;
        this.rank = rank;
        this.pics = pics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPics() {
        return pics;
    }

    public void setPics(int pic) {
        this.pics = pics;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
