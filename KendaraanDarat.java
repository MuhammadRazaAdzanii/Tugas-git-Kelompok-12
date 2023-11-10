public abstract class KendaraanDarat{
    private String Jenis;
    private String Nama;
    private int Tahun;
    private String Warna;
    private double Kecepatan;
    private double Jarak;
    private double Waktu;
    

    public KendaraanDarat(String Jenis, String Nama, int Tahun, String Warna, double Jarak, double Waktu) {
        this.Jenis = Jenis;
        this.Nama = Nama;
        this.Tahun = Tahun;
        this.Warna = Warna;
        this.Jarak = Jarak;
        this.Waktu = Waktu;
        this.Kecepatan = hitungKecepatan(Jarak, Waktu);

    }
     public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
    
    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public double getKecepatan() {
        return Kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.Kecepatan = kecepatan;
    }

    // Getter dan Setter untuk Jarak
    public double getJarak() {
        return Jarak;
    }

    public void setJarak(double jarak) {
        this.Jarak = jarak;
    }

    // Getter dan Setter untuk Waktu
    public double getWaktu() {
        return Waktu;
    }

    public void setWaktu(double waktu) {
        this.Waktu = waktu;
    }
    private double hitungKecepatan(double jarak, double waktu) {
        if (waktu != 0) {
            return jarak / waktu;
        } else {
            return 0;
        }
    }

   public void display()
   {
     System.out.println("Jenis: " + this.Jenis);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Tahun: " + this.Tahun);
        System.out.println("Warna: " + this.Warna); 
        System.out.println("Warna: " + this.Kecepatan); 
        System.out.println("Warna: " + this.Jarak); 
        System.out.println("Warna: " + this.Waktu); 
   }
   
    
    public abstract void JenisKendaraan();
    
    public void setJeniss(String Jenis)
    {
        this.Jenis = Jenis;
    }

}
