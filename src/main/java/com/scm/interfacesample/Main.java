package com.scm.interfacesample;

public class Main {
    public static void main(String[] args) {
        
        // Declare & Instantiate Cosmetic Object
        CosmeticShop cosmeticObj= new CosmeticShop();
        cosmeticObj.monthlySale();
        cosmeticObj.targetPlan();
        
        // Declare & Instantiate Fashion Object
        FashionShop fashionObj= new FashionShop();
        fashionObj.monthlySale();
        fashionObj.targetPlan();
        
        showTarget(cosmeticObj);
        showTarget(fashionObj);
    }
    
    public static void showTarget(Shop shop) {
        System.out.println("This is a shop");
    }
}
