package com.scm.interfacesample;

public class CosmeticShop implements Shop {

    @Override
    public void monthlySale() {
      System.out.println("MonthlySale for CosemticShop  is $2000");    
    }

    @Override
    public void targetPlan() {
        System.out.println("Targe Plan For January : $2500 ");
    }

}
