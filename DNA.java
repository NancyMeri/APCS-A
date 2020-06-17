
public class DNA{
    public static void main (String [] args){
        //set up patients
        String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
        String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
        String patient3 = "CACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTACGATCAGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATC";
        
        //test for Howlett's Syndrome:  ACG TTC GAG ATC GA
        String howlettsGenes = "ACGTTCGAGATCGA";
        boolean howletts1;
        boolean howletts2;
        boolean howletts3;
        if (patient1.indexOf(howlettsGenes) == -1){
            howletts1 = false;
        }
        else {
            howletts1 = true;
        }
        if (patient2.indexOf(howlettsGenes) == -1){
            howletts2 = false;
        }
        else {
            howletts2 = true;
        }
        if (patient3.indexOf(howlettsGenes) == -1){
            howletts3 = false;
        }
        else {
            howletts3 = true;
        }
        
        //test for Parker's Syndrome:  GTA CCA GTA CGA TCA G
        String parkersGenes = "GTACCAGTACGATCAG";
        boolean parkers1;
        boolean parkers2;
        boolean parkers3;
        if (patient1.indexOf(parkersGenes) == -1){
            parkers1 = false;
        }
        else {
            parkers1 = true;
        }
        if (patient2.indexOf(parkersGenes) == -1){
            parkers2 = false;
        }
        else {
            parkers2 = true;
        }
        if (patient3.indexOf(parkersGenes) == -1){
            parkers3 = false;
        }
        else {
            parkers3 = true;
        }
        
        //test for Danvers' Syndrome: ACT GGT CA
        String danversGenes = "ACTGGTCA";
        boolean danvers1;
        boolean danvers2;
        boolean danvers3;
        int a = patient1.length()/2;
        int b = patient2.length()/2;
        int c = patient3.length()/2;
        if (patient1.indexOf(danversGenes) == -1){
            danvers1 = false;
        }
        else if (patient1.substring(a, patient1.length()).indexOf(danversGenes) != -1){
            danvers1 = true;
        }
        else {
            danvers1 = false;
        }
        if (patient2.indexOf(danversGenes) == -1){
            danvers2 = false;
        }
        else if (patient2.substring(b, patient2.length()).indexOf(danversGenes) != -1){
            danvers2 = true;
        }
        else {
            danvers2 = false;
        }
        if (patient3.indexOf(danversGenes) == -1){
            danvers3 = false;
        }
        else if (patient3.substring(c, patient1.length()).indexOf(danversGenes) != -1){
            danvers3 = true;
        }
        else {
            danvers3 = false;
        }
        
        //test for Stark's Syndrome: GAT CGA TGT GCA GAC TAG CGA T
        String starksGenes = "GATCGATGTGCAGACTAGCGAT";
        boolean starks1;
        boolean starks2;
        boolean starks3;
        if (patient1.substring(0, a).indexOf(starksGenes) != -1){
            starks1 = true;
        }
        else {
            starks1 = false;
        }
        if (patient2.substring(0, b).indexOf(starksGenes) != -1){
            starks2 = true;
        }
        else {
            starks2 = false;
        }
        if (patient3.substring(0, c).indexOf(starksGenes) != -1){
            starks3 = true;
        }
        else {
            starks3 = false;
        }
        
        //test for Romanova's Syndrome: GTC AGG AC
        String romanovasGenes = "GTCAGGAC";
        boolean romanova1;
        boolean romanova2;
        boolean romanova3;
        if (patient1.indexOf(romanovasGenes) == -1){
            romanova1 = false;
        }
        else {
            int x = ((patient1.indexOf(romanovasGenes)) + 9);
            if (patient1.substring(0, x).indexOf(romanovasGenes) == -1 && patient1.substring(x).indexOf(romanovasGenes) == -1){
                romanova1 = false;
            }
            else{
                romanova1 = true;
            }
        }
        if (patient2.indexOf(romanovasGenes) == -1){
            romanova2 = false;
        }
        else {
            int y = ((patient2.indexOf(romanovasGenes)) + 9);
            if (patient2.substring(0, y).indexOf(romanovasGenes) == -1 && patient2.substring(y).indexOf(romanovasGenes) == -1){
                romanova2 = false;
            }
            else{
                romanova2 = true;
            }
        }
        if (patient3.indexOf(romanovasGenes) == -1){
            romanova3 = false;
        }
        else {
            int z = ((patient3.indexOf(romanovasGenes)) + 9);
            if (patient3.substring(0, z).indexOf(romanovasGenes) == -1 && patient3.substring(z).indexOf(romanovasGenes) == -1){
                romanova3 = false;
            }
            else{
                romanova3 = true;
            }
        }
        
        //test for LaForge Syndrome: GAT CGA TGT GCA GAC TAG CGA T
        String laforgesGenes = "GATCGATGTGCAGACTAGCGAT";
        boolean laforge1;
        boolean laforge2;
        boolean laforge3;
        if (patient1.substring(0, 40).indexOf(romanovasGenes) == -1){
            laforge1 = false;
        }
        else {
            laforge1 = true;
        }
        if (patient2.substring(0, 40).indexOf(romanovasGenes) == -1){
            laforge2 = false;
        }
        else {
            laforge2 = true;
        }
        if (patient3.substring(0, 40).indexOf(romanovasGenes) == -1){
            laforge3 = false;
        }
        else {
            laforge3 = true;
        }
        
        
        //print out patient 1's results:
        System.out.print("patient 1 ");
        if (howletts1 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Howlett's Syndrome");
        
        System.out.print("patient 1 ");
        if (parkers1 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Parker's Syndrome");
        
        System.out.print("patient 1 ");
        if (danvers1 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Danvers' Syndrome");
        
        System.out.print("patient 1 ");
        if (starks1 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Stark's Syndrome");
        
        System.out.print("patient 1 ");
        if (romanova1 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Romanova's Syndrome");
        
        //print out patient 2's results:
        System.out.print("patient 2 ");
        if (howletts2 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Howlett's Syndrome");
        
        System.out.print("patient 2 ");
        if (parkers2 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Parker's Syndrome");
        
        System.out.print("patient 2 ");
        if (danvers2 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Danvers' Syndrome");
        
        System.out.print("patient 2 ");
        if (starks2 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Stark's Syndrome");
        
        System.out.print("patient 2 ");
        if (romanova2 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Romanova's Syndrome");
        
        
        //print out patient 3's results:
        System.out.print("patient 3 ");
        if (howletts3 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Howlett's Syndrome");
        
        System.out.print("patient 3 ");
        if (parkers3 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Parker's Syndrome");
        
        System.out.print("patient 3 ");
        if (danvers3 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Danvers' Syndrome");
        
        System.out.print("patient 3 ");
        if (starks3 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Stark's Syndrome");
        
        System.out.print("patient 3 ");
        if (romanova3 == true) {System.out.print("does");}
        else {System.out.print("does not");}
        System.out.println(" have Romanova's Syndrome");
       
    }
}