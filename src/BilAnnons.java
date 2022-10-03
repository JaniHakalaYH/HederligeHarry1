public class BilAnnons extends FordonsAnnons{

    private String färg;
    private boolean sommardäck;
    private boolean vinterdäck;


    @Override
    void getAnnonsText() {
        String däck;
        if (sommardäck == true && vinterdäck == true){
            däck = "eommar och vinterdäck";
        }else if (sommardäck == true && vinterdäck == false){
            däck = "endast sommardäck";
        }else if (sommardäck == false && vinterdäck == true){
            däck = "endast vinterdäck";
        }else {
            däck = "inga hjul";
        }
        System.out.println("En grym "+getModell()+ " med "+däck+" Årsmodell "+getÅrsmodell()+ " färg " +färg+" "+getAntalMil()+ " mil "+getPris()+" kr! \nEn perfekt bil för den händige till ett fantastiskt pris.");
    }

    public BilAnnons(String färg, boolean sommardäck, boolean vinterdäck) {
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    public BilAnnons(int pris, String modell,  int årsmodell, int antalMil, String färg, boolean sommardäck, boolean vinterdäck) {
        super(pris, modell,  årsmodell, antalMil);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }
}
