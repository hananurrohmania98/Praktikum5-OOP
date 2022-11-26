public class Pegawai {
    private String nama;
    private double gajiPokok;

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double g) {
        gajiPokok = g;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Gaji Pokok : "+gajiPokok);
    }
}