public class Mobilya {

    String acıklama;
    double yukseklik;
    boolean kapaliMi;

    public Mobilya() {
    }

    public Mobilya(String acıklama, double yukseklik, boolean kapaliMi) {
        this.acıklama = acıklama;
        this.setYukseklik(yukseklik);
        this.kapaliMi = kapaliMi;



    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik > 0)
            this.yukseklik = yukseklik;

    }

    public boolean isKapaliMi() {
        return false;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return acıklama;
    }
}
