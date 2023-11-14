
public class Main
{
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Mobil","BMW M4", 2022, "Red",0.3,0.9);
        mobil1.display();
        
        Motor motor1 = new Motor("Motor","ZX25r", 2021, "Green",0.2,0.2);
        motor1.display();
        
        Bus bus1 = new Bus("Bus","Pelangi", 2023, "Rainbow",0.8,0.2);
        bus1.display();
        
        Becak becak1 = new Becak("Becak","Becak Jawa", 2019, "Red",0.2,0.5);
        becak1.display();
        
        Mobil a = new MobilListrik("mobil", "Tesla", 2023, "Black",0.3,0.4);
        a.BahanBakar();
        
        Mobil b = new MobilBensin("Mobil", "civic", 2018, "White",0.3,0.5);
        b.BahanBakar();
    }
}
