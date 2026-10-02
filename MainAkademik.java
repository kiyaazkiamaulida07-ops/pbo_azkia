public class MainAkademik {
    public static void main(String[] args) {
        // 1. Buat 2 objek mahasiswa menggunakan constructor
        Mahasiswa mhs1 = new Mahasiswa("22001", "Azkia Maulida", 40, 3.50);
        Mahasiswa mhs2 = new Mahasiswa("22002", "Alesha Azahra", 36, 3.20);

        System.out.println("=== DATA MAHASISWA (SEBELUM PENAMBAHAN) ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();

        // 2. Panggil method overloading kedua versinya
        // Mhs 1 menggunakan Versi 1 (1 parameter: nilaiAkhir)
        mhs1.hitungIPKSemester(3.80);

        // Mhs 2 menggunakan Versi 2 (2 parameter: nilaiAkhir, bobotSks)
        mhs2.hitungIPKSemester(4.00, 3);

        // 3. Tampilkan data mahasiswa SESUDAH nilai ditambahkan
        System.out.println("\n=== DATA MAHASISWA (SESUDAH PENAMBAHAN) ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
} 