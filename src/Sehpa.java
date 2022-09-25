public class Sehpa extends Mobilya implements Dortgen {

    double genislik;
    double derinlik;

    public Sehpa() {
    }

    public Sehpa(String acıklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(acıklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;

    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;

    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi() == false) {
            return genislik * derinlik;
        } else {
            return 6 * genislik * derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*yukseklik;
    }

    @Override
    public String toString() {
        return super.toString()+genislik*derinlik*yukseklik;
    }
}

