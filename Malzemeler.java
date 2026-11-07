public class Malzemeler {
    private String ad;
    private double miktar;
    private String birim; 

    
    public Malzemeler(String ad, double miktar, String birim) {
        this.ad = ad;
        this.miktar = miktar;
        this.birim = birim;
    }

    
    public String getAd() {
        return ad;
    }

    public double getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }
}
