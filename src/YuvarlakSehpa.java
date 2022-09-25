public class YuvarlakSehpa extends Mobilya implements Daire{

    double yaricap;

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String acıklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(acıklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;

    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi == false) {
            return Math.PI*yaricap*yaricap;
        }else {
            return 2*Math.PI*yaricap*yaricap+2*Math.PI*yaricap*yukseklik;
        }



    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*yukseklik;
    }

    @Override
    public String toString() {
        return super.toString()+yaricap*yukseklik;
    }
}
