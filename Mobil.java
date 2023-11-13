public class Mobil extends KendaraanDarat {
    
    public Mobil(String Jenis, String Nama, int Tahun, String Warna,  double Jarak, double Waktu) {
        super(Jenis, Nama, Tahun, Warna, Jarak, Waktu );
    }
    
    void BahanBakar()
    { }
    
    public void JenisKendaraan(){
        this.setJenis("Mobil");
    }
}
