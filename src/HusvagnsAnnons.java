public class HusvagnsAnnons extends FordonsAnnons{

    boolean dusch;
    int antalBäddar;


    @Override
    void getAnnonsText() {
        String finnsDusch;
        if (dusch) {
            finnsDusch = "dusch finns";
        }else{
            finnsDusch = "dusch finns tyvärr inte, men en hink däremot";
        }
        System.out.println("En grym "+getModell()+" årsmodell "+getÅrsmodell()+" för det billiga priset "+getPris()+" med "+antalBäddar+ " bäddar, "+finnsDusch);
    }

    public HusvagnsAnnons(boolean dusch, int antalBäddar) {
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }

    public HusvagnsAnnons(int pris, String modell, int årsmodell, int antalMil, boolean dusch, int antalBäddar) {
        super(pris, modell, årsmodell, antalMil);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }
}
