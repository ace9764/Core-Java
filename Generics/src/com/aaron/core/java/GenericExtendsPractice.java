package com.aaron.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenericExtendsPractice<F> {
    public static void main(String args[]){

        performTeamPractice();

    }

    public static void performTeamPractice(){

        Owner<Team> jaeyoung = new Owner("Jaeyoung");

        jaeyoung.add(new Team());

        jaeyoung.add(new SoccerTeam());

        jaeyoung.add(new UfcTeam());

        jaeyoung.add(new BaseballTeam());

        // 요가팀은 팀의 자손이아니고 Playable interface구현안햇기때문에 불가능!
        //jaeyoung.add(new YogaTeam());

        Owner<UfcTeam> seungbin = new Owner("Seungbin");

        seungbin.add(new UfcTeam());

        //SoccerTeam은 UfcTeam 의자손이 아니므로 불가
        //seungbin.add(new SoccerTeam());

        Owner<BaseballTeam> hongsun = new Owner("Hongsun");

        hongsun.add(new BaseballTeam());
        //UfcTeam은 Baseball team 의자손이 아니므로 불가
        //hongsun.add(new UfcTeam());


        List<Owner> ownerList = Arrays.asList(jaeyoung, hongsun, seungbin);
        Stream<Owner> ownerStream = ownerList.stream();
        ownerStream.forEach(s-> System.out.println("Owner: "+ s));

    }


}

class Owner<T extends Team & Playable>{

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "teamList=" + teamList +
                ", name='" + name + '\'' +
                '}';
    }

    List<T> teamList = new ArrayList<>();
    String name;

    public void add(T t){

        teamList.add(t);
    }

    public List<T> getTeamList(){

        return teamList;
    }

}

class Team implements Playable{

    @Override
    public String toString() {
        return "Team!";
    }

    @Override
    public void toPlay(){

        System.out.println("Team Play!");
    }
}

class BaseballTeam extends Team{

    @Override
    public String toString(){

        return "BaseBallTeam!";
    }
}

class SoccerTeam extends Team{

    @Override
    public String toString(){

        return "SoccerTeam!";
    }
}

class UfcTeam extends Team{

    @Override
    public String toString(){

        return "UFCTeam!";
    }
}

class YogaTeam {

    public YogaTeam(){

    }

    @Override
    public String toString(){

        return "YogaTeam!";
    }
}


interface Playable{

    public void toPlay();

}



