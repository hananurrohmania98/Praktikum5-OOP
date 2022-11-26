public class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double t) {
        tunjangan = t;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan : "+tunjangan);
    }

    public void cetakTunjangan() {
        System.out.println("Tunjangan : "+tunjangan);
    }
}