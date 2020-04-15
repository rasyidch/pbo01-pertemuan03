package Percabangan;

public class Switch {
    public static void main (String[] args) {
        char Nilai='D';
        switch(Nilai){
            case 'A':
                System.out.println("Mhs :\"terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya\"");
                break;
            case 'B':
                System.out.println("Mhs :\"Kenapa Saya Tidak Dapat A\"");
                System.out.println("Dosen : \"Belajar yang rajin lagi\"");
                break;
            case 'C':
                System.out.println("Mhs :\"Saya Sering Masuk Dan Ngumpul Tugas\"");
                System.out.println("Dosen : \"Tapi Bisa Ngerjawab Ujian Ga?\"");
                System.out.println("Mhs :\"Tentu Saja\"");
                break;
            default:
                System.out.println("Mhs :\"Saya Sering Masuk Dan Ngumpul Tugas\"");
                System.out.println("Dosen : \"Yakin Kamu?\"");
                System.out.println("Dosen : \"Periksa Berkas\"");
                System.out.println("Dosen : \"I Got You Kid\"");
                System.out.println("Mhs :\"Kabur\"");
                break;

        }
    }
}
