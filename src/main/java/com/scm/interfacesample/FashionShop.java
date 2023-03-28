package com.scm.interfacesample;

public class FashionShop implements Shop {

    @Override
    public void monthlySale() {
        System.out.println("Monthly Sale For Fashion Shop is $3000");   
    }

    @Override
    public void targetPlan() {
        System.out.println("Target Plan : Famous with Best Customer Service");
    }

}
