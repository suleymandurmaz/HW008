public class MainApp {
    public static void main(String[] args) {
        //TODO: Lütfen task.txt dosyasını okuyup, gereğini yapınız.
        Mobilya mobilya1=new Masa("Ahşap Masa",120,false,70,60);
        System.out.println(mobilya1);
        System.out.printf("Alan  = %5.2f\n",((Masa)mobilya1).alanHesapla());
        System.out.printf("Hacim = %5.2f\n",((Masa)mobilya1).hacimHesapla());;
        System.out.println();
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa : ",40,
                false,40);
        System.out.println(daire1);
        System.out.printf("Alan  = %5.2f\n",daire1.alanHesapla());
        System.out.printf("Hacim = %5.2f\n",daire1.hacimHesapla());
        Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa()};


        for (Dortgen dortgen:mobilyalar) {
            System.out.println(mobilyalar);
        }
    }
}
