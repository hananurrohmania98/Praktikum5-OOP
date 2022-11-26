public class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double b) {
        bonus = b;
    }

    public double getBonus() {
        return bonus;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus : "+bonus);
    }

    public void cetakBonus() {
        System.out.println("Bonus : "+bonus);
    }
}