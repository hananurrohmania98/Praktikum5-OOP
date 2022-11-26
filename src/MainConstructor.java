public class MainConstructor {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setNama("Hana Nur Rohmania");
        m.setGajiPokok(6000000);
        m.setTunjangan(3500000);
        m.cetakInfo();
        System.out.println("--------------------------------");
        Programmer p = new Programmer();
        p.setNama("Egi");
        p.setGajiPokok(1800000);
        p.setBonus(5000000);
        p.cetakInfo();
        System.out.println("--------------------------------");
        Programmer programmer = new Programmer();
        p.setNama("Adi");
        p.setGajiPokok(7000000);
        p.setBonus(2000000);
        p.cetakInfo();
    }
}