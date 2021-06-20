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
    // getter and setter

    public String getNamaPembeliBuah() {
        return namaPembeliBuah;
    }

    public void setNamaPembeliBuah(String namaPembeliBuah) {
        this.namaPembeliBuah = namaPembeliBuah;
    }

    public String getNamaPenjualBuah() {
        return namaPenjualBuah;
    }

    public void setNamaPenjualBuah(String namaPenjualBuah) {
        this.namaPenjualBuah = namaPenjualBuah;
    }

    public String getBuahKg() {
        return buahKg;
    }

    public void setBuahKg(String buahKg) {
        this.buahKg = buahKg;
    }

    //overriding

    @Override
    public boolean create() {
        return super.create();
    }

    @Override
    public boolean create(String namalatin) {
        return super.create(namalatin);
    }
}
