package com.company.structural.decorator;

public class JavaTeamLead implements Developer{

    private Developer developer;

    public JavaTeamLead(Developer developer) {
        this.developer = developer;
    }

    public String doJob() {
        return developer.doJob()+" Sends daily reports";
    }
}
