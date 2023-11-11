public class CheckKendaraan {

    public void printVehicleDetails(KendaraanDarat kendaraan) {
        System.out.println("+---------------------+-----------+-----------+-------+---------+-------+-----------+");
        System.out.println("|   Jenis_kendaraan   |   Nama    |   Warna   | Tahun | Jarak   | Waktu | Kecepatan |");
        System.out.println("+---------------------+-----------+-----------+-------+---------+-------+-----------+");
        
        if (kendaraan instanceof Becak || kendaraan instanceof Bus || kendaraan instanceof Mobil || kendaraan instanceof Motor) {
            String jenis = "";
            String nama = "";
            String warna = "";
            double jarak = 0;
            double waktu = 0;
            int tahun = 0;
            double Kecepatan = kendaraan.getKecepatan();

            if (kendaraan instanceof Becak) {
                Becak becak = (Becak) kendaraan;
                jenis = becak.getJenis();
                nama = becak.getNama();
                warna = becak.getWarna();
                tahun = becak.getTahun();
                jarak = becak.getJarak();
                waktu = becak.getWaktu();

            } else if (kendaraan instanceof Bus) {
                Bus bus = (Bus) kendaraan;
                jenis = bus.getJenis();
                nama = bus.getNama();
                warna = bus.getWarna();
                tahun = bus.getTahun();
                 jarak = bus.getJarak();
                waktu = bus.getWaktu();
            } else if (kendaraan instanceof Mobil) {
                Mobil mobil = (Mobil) kendaraan;
                jenis = mobil.getJenis();
                nama = mobil.getNama();
                warna = mobil.getWarna();
                tahun = mobil.getTahun();
                 jarak = mobil.getJarak();
                waktu = mobil.getWaktu();
            } else if (kendaraan instanceof Motor) {
                Motor motor = (Motor) kendaraan;
                jenis = motor.getJenis();
                nama = motor.getNama();
                warna = motor.getWarna();
                tahun = motor.getTahun();
                 jarak = motor.getJarak();
                waktu = motor.getWaktu();
            }

            System.out.printf("| %-12s        | %-10s| %-10s| %5d | %7.2f | %5.2f | %7.2f   |%n", jenis, nama, warna, tahun, jarak, waktu, 
            Kecepatan);
       
        } 
        else {
            System.out.println("| Jenis kendaraan tidak dikenal.                  ");
        }
        System.out.println("+---------------------+-----------+-----------+-------+---------+-------+-----------+");              
    }

    public static void main(String[] args) {
        KendaraanDarat becak = new Becak("Becak", "Becak Saya", 2020, "Hijau", 2.3, 0.5);
        KendaraanDarat bus = new Bus("Bus", "Busku", 2018, "Merah",0.2,0.4);
        KendaraanDarat mobil = new Mobil("Sedan", "Mobil Saya", 2021, "Hitam",0.3,0.6);
        KendaraanDarat motor = new Motor("Sepeda Motor", "Motor Saya", 2019, "Biru",0.8,0.7);

        CheckKendaraan checker = new CheckKendaraan();

        checker.printVehicleDetails(becak);
        checker.printVehicleDetails(bus);
        checker.printVehicleDetails(mobil);
        checker.printVehicleDetails(motor);
    }
}
