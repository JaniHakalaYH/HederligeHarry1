public abstract class FordonsAnnons {

    private int pris;
    private String modell;
    private int årsmodell;
    private int antalMil;

    abstract void getAnnonsText();

    FordonsAnnons(){}

    public FordonsAnnons(int pris,  String modell, int årsmodell, int antalMil) {
        this.pris = pris;
        this.modell = modell;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }

    public int getPris() {
        return pris;
    }

    public String getModell() {
        return modell;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public int getAntalMil() {
        return antalMil;
    }
}
