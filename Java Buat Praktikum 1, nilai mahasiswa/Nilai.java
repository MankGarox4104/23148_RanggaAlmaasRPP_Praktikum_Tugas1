public class Nilai {
    // Variabel untuk menyimpan data mahasiswa dan nilai
    String NIM;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    // Konstruktor untuk menginisialisasi nilai-nilai
    public Nilai(String NIM, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    // Method untuk mencetak nilai-nilai
    public void CetakNilai() {
        System.out.println("NIM              : " + NIM);
        System.out.println("Nama             : " + nama);
        System.out.println("Nilai");
        System.out.println("Absen [10%]      : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS [30%]  : " + nilaiUTS);
        System.out.println("Nilai UAS [40%]  : " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + hitungNilaiAkhir());
    }
}
