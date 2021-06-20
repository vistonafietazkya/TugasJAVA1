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
        System.out.println("================================================================")
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

}
