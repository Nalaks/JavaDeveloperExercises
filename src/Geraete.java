public class Geraete {
    private String name;
    private String hersteller;
    private int baujahr;
    private int preis;

    public Geraete(String name, String hersteller, int baujahr, int preis) {
        this.name = name;
        this.hersteller = hersteller;
        this.baujahr = baujahr;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public void wertAbschreiben() {
        preis = preis - (preis / 10);
        if (preis < 0) {
            preis = 0;
        }
    }

    @Override
    public String toString() {
        return name +  " (Hersteller: " + hersteller + "), Baujahr: " + baujahr + ", € " + preis + ",–";
    }
}
