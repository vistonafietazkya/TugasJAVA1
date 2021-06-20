package Model;

//SuperClass/Parent-Class
public class Buah {

    //8 atribute buah

    public String namabuah;
    public String jenisbuah;
    public String warnabuah;
    public String asalbuah;
    public String namalatin;
    public String musimbuah;
    public int batasbuah;
    public String rasabuah;

    // 4 Method class buah

    public void tampilkanAtribut(){
        System.out.println("================================================================");
        System.out.println("Nama Buah : "+namabuah);
        System.out.println("Jenis Buah : "+jenisbuah);
        System.out.println("Warna Buah : "+warnabuah);
        System.out.println("Asal Buah : "+asalbuah);
        System.out.println("Nama Latin : "+namalatin);
        System.out.println("Musim Buah : "+musimbuah);
        System.out.println("Batas Buah : "+batasbuah);
        System.out.println("Rasa Buah : "+rasabuah);
    }
    public void tampilkanInfoBuah(){
        System.out.println("==================================================================");
        System.out.println("Nama Buah : "+namabuah);
        System.out.println("Jenis Buah : "+jenisbuah);
        System.out.println("Warna Buah : "+warnabuah);
        System.out.println("Asal Buah : "+asalbuah);
        System.out.println("Rasa Buah : "+rasabuah);
    }
    public boolean create(){
        String insertCreate = "INSERT INTO buah VALUES ('"+namabuah+"', '"+warnabuah+"', "+ batasbuah+")";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if(berhasil) {
            return true;
        }else {
            return false;
        }
    }
    public boolean create(String namalatin) {
        String insertCreate = "INSERT INTO buah VALUES Nama Latin " + namalatin;
        System.out.println(insertCreate);
        return false;

    }

    //Constructor

    public Buah(){
        System.out.println("=============================================================");
        namabuah = "Please Isi Nama Buah";
        jenisbuah = "Please Isi Jenis Buah";
        warnabuah = "Please Isi Warna Buah";
        rasabuah = "Please Isi Rasa Buah";
    }
    public Buah(String jenisbuah, String warnabuah){
        this.jenisbuah = jenisbuah;
        this.warnabuah = warnabuah;
    }
    public Buah(String namabuah, String musimbuah, String rasabuah){
        this.rasabuah = rasabuah;
        this.namabuah = namabuah;
        this.musimbuah = musimbuah;
    }
    //getter and setter

    public String getNamabuah() {
        return namabuah;
    }

    public void setNamabuah(String namabuah) {
        this.namabuah = namabuah;
    }

    public String getJenisbuah() {
        return jenisbuah;
    }

    public void setJenisbuah(String jenisbuah) {
        this.jenisbuah = jenisbuah;
    }

    public String getWarnabuah() {
        return warnabuah;
    }

    public void setWarnabuah(String warnabuah) {
        this.warnabuah = warnabuah;
    }

    public String getAsalbuah() {
        return asalbuah;
    }

    public void setAsalbuah(String asalbuah) {
        this.asalbuah = asalbuah;
    }

    public String getNamalatin() {
        return namalatin;
    }

    public void setNamalatin(String namalatin) {
        this.namalatin = namalatin;
    }

    public String getMusimbuah() {
        return musimbuah;
    }

    public void setMusimbuah(String musimbuah) {
        this.musimbuah = musimbuah;
    }

    public int getBatasbuah() {
        return batasbuah;
    }

    public void setBatasbuah(int batasbuah) {
        this.batasbuah = batasbuah;
    }

    public String getRasabuah() {
        return rasabuah;
    }

    public void setRasabuah(String rasabuah) {
        this.rasabuah = rasabuah;
    }
}
