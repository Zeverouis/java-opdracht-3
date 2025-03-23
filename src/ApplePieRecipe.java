public class ApplePieRecipe {
    Ingredient ongezouten_roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient witte_bastard_suiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient zelfrijzend_bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuks", "ei");
    Ingredient vanillesuiker = new Ingredient(18, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetzure_appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristal_suiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public void printStep1Recipe(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void printStep2Recipe(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, " +
                "het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void printStep3Recipe(){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille " +
                "suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void printStep4Recipe(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void printStep5Recipe(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void printStep6Recipe(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van " +
                "het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede " +
                "vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void printStep7Recipe(){
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel " +
                "overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in" +
                "de vorm.");
    }

    public void printStep8Recipe(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer " +
                "1 cm breed.");
    }

    public void printStep9Recipe(){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand " +
                "rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void printStep10Recipe(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden" +
                "Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printAllRecipe(){
        printStep1Recipe(); printStep2Recipe(); printStep3Recipe(); printStep4Recipe(); printStep5Recipe();
        printStep6Recipe(); printStep7Recipe(); printStep8Recipe(); printStep9Recipe(); printStep10Recipe();
    }

    public void printIngredients(){
        System.out.println(ongezouten_roomboter.getAmount() + " " + ongezouten_roomboter.getUnit() + " " +
                ongezouten_roomboter.getName());
        System.out.println(witte_bastard_suiker.getAmount() + " " + witte_bastard_suiker.getUnit() + " " +
                witte_bastard_suiker.getName());
        System.out.println(zelfrijzend_bakmeel.getAmount() + " " + zelfrijzend_bakmeel.getUnit() + " " +
                zelfrijzend_bakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(zoetzure_appels.getAmount() + " " + zoetzure_appels.getUnit() + " " + zoetzure_appels.getName());
        System.out.println(kristal_suiker.getAmount() + " " + kristal_suiker.getUnit() + " " + kristal_suiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }
}

