import java.util.Scanner;
//import java.lang.Math;

class Biodata {
    String nama;
    String hobi;
    int umur;

    Biodata (String nama2, String hobi2, int umur2 ) {
        nama = nama2;
        this.hobi = hobi2;
        this.umur = umur2;
    }

    void menyapa(){
        System.out.println("Halo, saya " + nama);
    }

}

public class Main {


    public static void calculator(int angka1, int angka2, String operasi) {
        if (operasi.equals("+")) {
            System.out.println("hasil =  " + (angka1 + angka2));
        } else if (operasi.equals("-")) {
            System.out.println("hasil =  " + (angka1 - angka2));
        } else if (operasi.equals("*")) {
            System.out.println("hasil =  " + (angka1 * angka2));
        } else if (operasi.equals("/")) {
            System.out.println("hasil =  " + (angka1 / angka2));
        } else {
            System.out.println("angka yg anda masukkan salah");
        }
    }

    public static void main(String[] args) {

        Biodata datasaya = new Biodata("winny" , "makan", 17);

        datasaya.menyapa();
        System.out.println("Nama saya : " + datasaya.nama);
        System.out.println("Hobi saya : " + datasaya.hobi);


        boolean tanyaboolean = true;
        Scanner input = new Scanner(System.in);

        while (tanyaboolean)
        {
            System.out.println("Lanjut");

            {
                System.out.println("Masukkan angka pertama : ");
                int angka1 = Integer.parseInt(input.nextLine());
                System.out.println("Masukkan operasi matematika +, -, *, /  ");
                String operasi = input.nextLine();
                System.out.println("Masukkan angka kedua : ");
                int angka2 = Integer.parseInt(input.nextLine());

                System.out.println("Hasil " + (angka1) + (operasi) + (angka2));

               calculator(angka1, angka2, operasi);

                System.out.println("Mau lanjut? ya/tidak");
                String tanya = (input.nextLine());

                if (tanya.equals("ya"))
                    tanyaboolean = true;
                else {
                    tanyaboolean = false;
                    System.out.println("done");
                }
            }
        }

        input.close();



//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan nama Anda : ");
//        String nama = input.nextLine();
//
//        System.out.println("Halo " + nama );
//        if (nama.equals("loopy")){
//            System.out.println("Yuhuu");
//        }
//        else {
//            System.out.println("Siapa anda?");
//        }
//        input.close();


        //---------------------------------

//        String nama = "232434";
//        System.out.println( nama);
//        System.out.println("akulah " + nama);

        // uhuy
//
//        double a = 10;
//        double b = 20;
//
//       // int kurang = a-b;
//       // int kali = a*b;
//        double bagi = a/b;
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//       // System.out.println(kurang);
//       // System.out.println(kali);
//        System.out.println( bagi);

//
//        // operator logika dan atau bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        System.out.println(!true);
//        System.out.println(!false);
//
//        System.out.println(false && (false || true) );
//
//
//        boolean makan = true;
//        boolean minum = false;
//
//        boolean aturan = makan || minum;
//        System.out.println(aturan);
//        System.out.println(makan && minum);


        //perbandingan < > == <= >=
//        int a = 33;
//        int b = 32;
//        System.out.println(a<=b);

        //kondisi
//        int saldo = 1000;
//        int tarik = 1500;
//
//        if (tarik > 1000 && tarik < saldo ) {
//            System.out.println("Saldo berhasil ditarik, dan anda sudah mencapai limit tarikan perhari");
//        }
//        else if (tarik < saldo) {
//            System.out.println("Saldo berhasil ditarik");
//        }
//            else {
//                System.out.println("Saldo anda kurang");
//            }



        //looping
        //tdk terdefinisi, tdk ada batasan, e.g kalkulator = pakai while
        //indeks / array = pakai for
//        int cek = 1;
//        while (cek <= 10) {
//            System.out.println("looping" + cek);
//
//            cek = cek+1;
//        }
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println("looping" + i);
//        }



    }
}