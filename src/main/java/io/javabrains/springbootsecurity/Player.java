package io.javabrains.springbootsecurity;

public class Player implements Comparable<Player>{
    Integer Score;
    String Name;

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int compareTo(Player o) {

        return 0;
    }

    public int compare(Player a , Player b){
        if(a.getScore() < b.getScore()){
            return 1;
        }
        if(a.getScore() > b.getScore()){
            return -1;
        }
        if(a.getScore() == b.getScore()){
        return     a.getName().compareTo(b.getName());
        }


        return 0;
    }
}
