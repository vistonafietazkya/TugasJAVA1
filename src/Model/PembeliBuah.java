package Model;

//SubClass/Child-Class
public class PembeliBuah extends Buah {

    public String namaPembeliBuah;
    public String namaPenjualBuah;
    public String buahKg;

    public void infoBuah(){
        System.out.println("==============================================================");
        System.out.println("Nama Pembeli Buah : "+namaPembeliBuah);
        System.out.println("Nama Penjual Buah : "+namaPenjualBuah);
        System.out.println("Jumlah Kg Buah yang Dibeli : "+buahKg);
    }
    public void Penjual(){
        String pj = "INSERT INTO Buah VALLUES ('"+namaPenjualBuah+"')";
    }
}
