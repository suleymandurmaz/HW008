public class Masa extends Mobilya implements Dortgen{


    double derinlik;
    double genislik;

    public Masa() {
    }

    public Masa(String acıklama, double yukseklik, boolean kapaliMi, double derinlik, double genislik) {
        super(acıklama, yukseklik, kapaliMi);
        this.derinlik = derinlik;
        this.genislik = genislik;
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik=genislik;

    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik=derinlik;

    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        return genislik*derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+genislik*derinlik*getGenislik();
    }
}
