package com.company.structural.decorator;

public class JavaSeniorDeveloper implements Developer{

    private Developer developer;

    public JavaSeniorDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String doJob() {
       return developer.doJob()+" Writes code review";
    }
}
