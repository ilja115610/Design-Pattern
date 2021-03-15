package com.company.structural.Adapter;

public class UserClass {



    public static void main(String[] args) {

        PCGame game = new PCToComputerGameAdapter("Quake",PegiAgeRating.P16,2000000.0
                ,2,3,8,4,3.3);

        System.out.println(game.getTitle()+'\n'+game.isTripleAGame()+'\n'+game.getPegiAllowedAge()+'\n'+game.getRequirements());
    }

}
