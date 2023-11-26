public class MainApp {
    public static void main(String[] args) throws Exception {
        Mobil mobil1 = new Mobil("M1",120 , 5, 4 );
        Bus bus1 = new Bus("B1", 80,40,30);
        double jarak = 300;

        System.out.println("informasi mobil:\n"+ mobil1.toString());
        System.out.println("\n\n waktu tempuh dengan mobil: "+mobil1.hitungWaktuTempuh(jarak));
        System.out.println("informasi bus:\n"+ bus1.toString());
        System.out.println("\n\n waktu tempuh dengan bus: "+bus1.hitungWaktuTempuh(jarak));
    }
}
