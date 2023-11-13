public class Motor extends KendaraanDarat {
    public Motor(String Jenis, String Nama, int Tahun, String Warna,  double Jarak, double Waktu) {
        super(Jenis, Nama, Tahun, Warna, Jarak, Waktu )        
    }

    public void JenisKendaraan(){
        this.setJenis("Motor");
    }
}
