package Model;

public class AksiBuah {
    public static void main(String[] args) {

        //object Class 1
        Buah buah1 = new Buah();
        buah1.namabuah = "Apel";
        buah1.jenisbuah = "Apel Malang";
        buah1.warnabuah = "Hijau";
        buah1.asalbuah = "Malang";
        buah1.namalatin = "Malus Sylvestris";
        buah1.musimbuah = "Januari Sampai Maret";
        buah1.batasbuah =  5;
        buah1.rasabuah = "Manis";
        buah1.tampilkanAtribut();
        buah1.create();
        buah1.create("Pembeli Buah");

        //object Class 2
        PembeliBuah buah2 = new PembeliBuah();
        buah2.namabuah = "Jeruk";
        buah2.jenisbuah = "Jeruk Bali";
        buah2.warnabuah = "Kemerahan";
        buah2.asalbuah = "Asia Selatan dan Tenggara";
        buah2.namalatin = "Citrus Maxima";
        buah2.musimbuah = "Februari Sampai Mei";
        buah2.batasbuah = 3;
        buah2.rasabuah = "Manis dan Masrfd4am";
        buah2.tampilkanInfoBuah();
        buah2.create();
    // Constructor dengan method (object)
    Buah ba1 = new Buah();
    ba1.tampilkanAtribut();
    Buah ba2 = new Buah();
    ba2.tampilkanInfoBuah();

    Buah ba3 = new Buah("Mangga","Kuning");
    ba3.tampilkanInfoBuah();
    Buah ba4 = new Buah("Jeruk", "Hijau");
    ba4.tampilkanAtribut();

    Buah ba5 = new Buah("Jambu","April sampai Juli","Asam");
    ba5.tampilkanInfoBuah();
    Buah ba6 = new Buah("Nanas","Juli sampai November","Manis dan asam");
    ba6.tampilkanAtribut();

    //overriding
        PembeliBuah or =new PembeliBuah();
        or.create();
        or.create("Malus Sylvestris");


    }
}





