public class MobilBensin extends Mobil {
  
    
    public MobilBensin(String Jenis, String Nama, int Tahun, String Warna, double Jarak, double Waktu) {
        super(Jenis, Nama, Tahun, Warna, Jarak, Waktu );
        
    }
    
    void BahanBakar()
    {
        System.out.println("Bensin");
    }
    
}
