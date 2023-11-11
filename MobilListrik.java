public class MobilListrik extends Mobil {
   
    public MobilListrik(String Jenis, String Nama, int Tahun, String Warna, double Jarak, double Waktu) {
        super(Jenis, Nama, Tahun, Warna, Jarak, Waktu );     
    }
    void BahanBakar()
    {
        System.out.println("Listrik");
    }
}
