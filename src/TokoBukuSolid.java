public class TokoBukuSolid {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku pemrograman = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750);

        Buku algoritma = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400);

        Buku oop = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5);

        Buku kisah = new BukuAudio(
                "Kisah Programmer", "Budi Santoso", 60000, 240);


        // Membuat keranjang pertama
        Keranjang keranjangPertama = new Keranjang();

        keranjangPertama.tambah(pemrograman);
        keranjangPertama.tambah(algoritma);
        keranjangPertama.tambah(oop);
        keranjangPertama.tambah(kisah);


        // Membuat keranjang kedua
        Keranjang keranjangKedua = new Keranjang();

        keranjangKedua.tambah(oop);


        // Membuat pilihan metode pembayaran
        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };


        // Membuat objek StrukPrinter
        StrukPrinter printer = new StrukPrinter();


        // Mencetak keranjang pertama
        printer.cetakKeranjang(
                "KERANJANG PERTAMA",
                keranjangPertama);

        printer.cetakPembayaran(
                keranjangPertama.hitungTotal(),
                pilihan);


        System.out.println();


        // Mencetak keranjang kedua
        printer.cetakKeranjang(
                "KERANJANG KEDUA",
                keranjangKedua);

        printer.cetakPembayaran(
                keranjangKedua.hitungTotal(),
                pilihan);
    }
}
