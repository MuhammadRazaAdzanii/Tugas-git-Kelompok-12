public class Becak extends KendaraanDarat
 {
   
    public Becak(String Jenis, String Nama, int Tahun, String Warna, double Jarak, double Waktu) {
        super(Jenis, Nama, Tahun, Warna,  Jarak, Waktu );
        
    }

    public void JenisKendaraan(){
        this.setJenis("civic");
    }
}
