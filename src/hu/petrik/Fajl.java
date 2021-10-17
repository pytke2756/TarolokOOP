package hu.petrik;

public class Fajl {
    private String nev;
    private String kiterjesztes;
    private int meret; //byte
    private String tartalom;

    public Fajl(String nev, String kiterjesztes, String tartalom) {
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
        this.tartalom = tartalom;
        this.meret = tartalom.length();
    }


    public String getTartalom() {
        return this.tartalom;
    }

    @Override
    public String toString() {
        return String.format("%s.%s %d",this.nev,this.kiterjesztes, this.meret);
    }
}
