import java.util.Scanner;

// NAMA : RAKA ALPIANSYAH
// NIM : 1237050112
// KELAS : C & PDP KELAS : D

class Kasir {
  public static void main(String[] argumen) {
// untuk program true or false, jika salah input maka akan kluar
    boolean programBerjalan = true;
// variabel yang di gunakan angka bilangan bulat
    int totalBarang1 = 50, totalBarang2 = 50, totalBarang3 = 50, totalBarang4 = 50, totalkotor = 0, totalmodal = 0, kembalian = 0, keuntungan = 0;
    int nomorBarangDibeli, kuantitasBarangDibeli, bayar;
    
    Scanner inputPengguna = new Scanner(System.in);
//  variabel yang di gunankan untuk text
    String kataPembuka;
// untuk looping/perulangan pada menu
    while(programBerjalan) {
// daftar menu
      kataPembuka = "========================================================";
      kataPembuka += "\nSelamat datang di Toko Impian, mau beli barang apa ?";
      kataPembuka += "\n1. Poster Hidup bahagia dunia akhirat ($ 33) - " + totalBarang1 + " Stock";
      kataPembuka += "\n2. Poster Kapal pesiar dan uang 63 trilyun rupiah ($ 23) - " + totalBarang2 + " Stock";
      kataPembuka += "\n3. Poster Kemampuan untuk bernapas di dalam air ($ 38) - " + totalBarang3 + " Stock";
      kataPembuka += "\n4. Poster Kebun berisi tomat dan apel untuk dijual ($ 15) - " + totalBarang4 + " Stock";
      kataPembuka += "\n0. Program ini kurang bermanfaat, saya memilih keluar";
      kataPembuka += "\n9. pembayaran";
      kataPembuka += "\n\nTotal keuntungan toko saat ini $ " + keuntungan + ",,, alhamdulillah";
      kataPembuka += "\n========================================================";
      kataPembuka += "\n\nPilih nomor barang (1 / 2 / 3 / 4):";

      System.out.println(kataPembuka);
      nomorBarangDibeli = inputPengguna.nextInt();
// untuk memilih menu yg tertera
      if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4) {
// untuk menampilkan barang yang dibeli dan menanyakan berapa banyak yg dipilih
        System.out.println("Barang nomor " + nomorBarangDibeli + " dipilih\nMau berapa banyak ?");
// untuk memanggil kuantitasbarangdibeli
        kuantitasBarangDibeli = inputPengguna.nextInt();
// untuk menampilkan jumlah barang yg dibeli
        System.out.println("Barang nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");
// untuk menghitung program yg dibutuhkan
        switch(nomorBarangDibeli) {
          case 1:
            totalBarang1 -= kuantitasBarangDibeli;
            totalmodal += kuantitasBarangDibeli * 30;
            totalkotor += kuantitasBarangDibeli * 33;
            keuntungan = totalkotor - totalmodal;
            break;
          case 2:
            totalBarang2 -= kuantitasBarangDibeli;
            totalmodal += kuantitasBarangDibeli * 20;
            totalkotor += kuantitasBarangDibeli * 23;
            keuntungan = totalkotor - totalmodal;
            break;
          case 3:
            totalBarang3 -= kuantitasBarangDibeli;
            totalmodal += kuantitasBarangDibeli * 35;
            totalkotor += kuantitasBarangDibeli * 38;
           keuntungan = totalkotor - totalmodal;
            break;
          case 4:
            totalBarang4 -= kuantitasBarangDibeli;
            totalmodal += kuantitasBarangDibeli * 12;
            totalkotor += kuantitasBarangDibeli * 15;
            keuntungan = totalkotor - totalmodal;
            break;
        }
    // jika pilih 0 maka keluar
    } else if (nomorBarangDibeli == 0) {
        System.out.println("Sayang sekali, kamu melewatkan barang rahasia");
        break;
    // jika pilih 9 maka pembayaran
    } else if (nomorBarangDibeli == 9) {
        System.out.println("======[PEMBAYARAN]======");
    // untuk menampilkan total harga belanja
        System.out.println("total belanja : $" + totalkotor);
        System.out.print("bayar : $");
    // untuk memanggil variabel bayar
        bayar = inputPengguna.nextInt();
    // untuk menghitung kembalian
        kembalian = bayar - totalkotor;
    // untuk menampilkan kembalian
        System.out.println("kembalian : $" + kembalian);
    // selesai atau keluar tidak ada  looping
        break;
    
    } else {
        programBerjalan = false; 
      }
    }
  }
}
