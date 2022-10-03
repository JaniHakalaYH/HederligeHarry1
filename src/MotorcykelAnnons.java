public class MotorcykelAnnons extends FordonsAnnons{
    int kubik;
    String drivtyp;

    @Override
    void getAnnonsText() {
        System.out.println("Den här fina "+getModell()+" motorcykeln från år "+getÅrsmodell()+" kostar endast "+getPris()+" och har endast gått "+getAntalMil());
    }
    public MotorcykelAnnons(int kubik, String drivtyp) {
        this.kubik = kubik;
        this.drivtyp = drivtyp;
    }
    public MotorcykelAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil, int kubik, String drivtyp) {
        super(pris, beskrivning, årsmodell, antalMil);
        this.kubik = kubik;
        this.drivtyp = drivtyp;
    }
}
