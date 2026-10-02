public class Mahasiswa {
    // 1. Atribut
    public String nim;
    public String nama;
    public int sks;
    public double ipk;

    // 2. Constructor (4 parameter untuk mengisi seluruh atribut)
    public Mahasiswa(String nim, String nama, int sks, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
    }

    // 3. Method Overloading: hitungIPKSemester()
    
    // Versi 1 — 1 parameter (double nilaiAkhir)
    public double hitungIPKSemester(double nilaiAkhir) {
        this.ipk = (this.ipk + nilaiAkhir) / 2;
        return this.ipk;
    }

    // Versi 2 — 2 parameter (double nilaiAkhir, int bobotSks)
    public double hitungIPKSemester(double nilaiAkhir, int bobotSks) {
        this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks)) / (this.sks + bobotSks);
        this.sks = this.sks + bobotSks; // update SKS
        return this.ipk;
    }

    // 4. Method tampilkanData()
    public void tampilkanData() {
        System.out.println("NIM       : " + this.nim);
        System.out.println("Nama      : " + this.nama);
        System.out.println("Total SKS : " + this.sks);
        System.out.println("IPK       : " + String.format("%.2f", this.ipk));
        System.out.println("-----------------------------------");
    }
}