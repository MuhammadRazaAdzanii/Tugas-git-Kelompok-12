
public class Main
{
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Mobil","Corolla", 2022, "Red",0.3,0.9);
        mobil1.display();
        
        Motor motor1 = new Motor("Mobil","Corolla", 2022, "Red",0.2,0.2);
        motor1.display();
        
        Bus bus1 = new Bus("Mobil","Corolla", 2022, "Red",0.8,0.2);
        bus1.display();
        
        Becak becak1 = new Becak("Mobil","Corolla", 2022, "Red",0.2,0.5);
        becak1.display();
        
        Mobil a = new MobilListrik("civic", "bobon", 2004, "Merah",0.3,0.4);
        a.BahanBakar();
        
        Mobil b = new MobilBensin("civic", "bobon", 2004, "Merah",0.3,0.5);
        b.BahanBakar();
    }
    
    
    
}
