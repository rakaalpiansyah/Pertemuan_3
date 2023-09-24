import java.util.Scanner;

public class kasir1 {
    // RAKA ALPIANSYAH 
    // NIM = 1237050112
    // KELAS C / PDP KELAS D
    int pil, jumlah;
    double harga, bayar, total, kembalian;
   
    public static void main(String[] args) {
        boolean kata = true;
        // bisa menggunakan try atau tidak tergantung selera
        try (Scanner input = new Scanner(System.in)){   
        kasir1 i = new kasir1();
        // salam atau pemanis kata2 
        System.out.println("========================================");
        System.out.println("\t    -Selamat Datang-");
        System.out.println("\t     Di TOKO SIAPA?");
        System.out.println("[Apa Yang Anda Butuhkan Pasti tidak Ada]");
        System.out.println("========================================");
        // Untuk melakukan Looping/perulangan menu
        while(kata) {
            // menu toko
            System.out.println("[===========================]");
            System.out.println("1. Kopi (Rp. 5.000)");
            System.out.println("2. Thai Tea (Rp. 7.000)" );
            System.out.println("3. Air Putih (Rp. 10.000)");
            System.out.println("4. Susu (Rp. 5.000)");
            System.out.println("0. Keluar");
            System.out.println("9. Selesai dan Pembayaran");
            System.out.println("[===========================]");
            System.out.println("\t Masukkan Menu");
            i.pil = input.nextInt();
            // hanya untuk dapat memilih pilihan 1 - 4
            if (i.pil >= 1 && i.pil <=4) {
                System.out.println("Masukkan Jumlah Barang Yang Anda BEli");
                i.jumlah = input.nextInt();
            } else if (i.pil == 9) {
                // jika selesai pembayaran maka akan keluar
                break;
            } else {
                // jika langsung keluar 
                System.out.println("Jangan datang lagi");
            } i.hitungTotal(i.jumlah);
        }
        i.tampilkantotal();
        // tampilkan uang yang akan di bayar
        System.out.print("BAYAR : Rp.");
        i.bayar= input.nextDouble();
        i.hitungKembalian();
        i.tampilkankembalian();
    }
   kata = false;
}
    // cara menghitung total harga  dan barang yang di beli
        double hitungTotal(int jumlah) {
            switch (pil) {
                case 0:
                // untuk keluar toko tanpa belanja
                    System.exit(0);
                    break;
                case 1:
                    harga = 5000;
                    total += harga * jumlah;
                    break;
                case 2:
                    harga = 7000;
                    total += harga * jumlah;
                    break;
                case 3:
                    harga = 10000;
                    total += harga * jumlah;
                    break;
                case 4:
                    harga = 5000;
                    total += harga * jumlah;
                    break;
                case 9:
                    break;
                    default:
                    // jika memlilih selain 1 2 3 4 9 0 akan keluar kata di bawah
                    System.out.println("\n\n yang anda input salah");
                }
                return total;
    }
    
    // menampilkan total total pembayaran
    void tampilkantotal() {
        System.out.println("======[PEMBAYARAN]======");
        System.out.println("Total : Rp." + total);
    }
    // menghitung kembalian pelanggan
    double hitungKembalian() {
        kembalian = bayar - total;
        return kembalian;
    }
    // menampilkan kembalian pelanggan
    void tampilkankembalian() {
        System.out.println("Kembalian : Rp." + kembalian);
        System.out.println("======[TERIMA KASIH]======");
    }
}