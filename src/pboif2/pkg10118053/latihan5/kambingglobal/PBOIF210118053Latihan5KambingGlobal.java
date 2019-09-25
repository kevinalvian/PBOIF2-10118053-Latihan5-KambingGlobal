/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA : Kevin Alvian
 * KELAS : IF2
 * NIM : 10118053
 */
public class PBOIF210118053Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
      int jumlahKambing = 88;
      //Variabel jumlahkambing menjadi variabel instance
      public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
      // Method untuk menampilkan jumlah kambing
          public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                jumlahKambing);
    }     
    public static void main(String[] args) {
        PBOIF210118053Latihan5KambingGlobal kambingSusu = new PBOIF210118053Latihan5KambingGlobal();
      
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
        // Menambah satu kambing
         kambingSusu.tambahKambing();
         
        // Menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();

    }
    
}
