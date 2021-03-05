package com.company.structural.decorator;

public class Test {

    public static void main(String[] args) {

        Developer developer = new JavaDeveloper();

        Developer developer1 = new JavaSeniorDeveloper(new JavaDeveloper());

        Developer developer2 = new JavaTeamLead(new JavaSeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.doJob());
        System.out.println(developer1.doJob());
        System.out.println(developer2.doJob());
    }
}
