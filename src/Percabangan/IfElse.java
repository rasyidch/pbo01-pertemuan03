package Percabangan;

public class IfElse {
    public static void main (String[] args) {
        double totalBelanja = 53000;
        double uangDompet = 25000;

        if(uangDompet<totalBelanja){
            System.out.println("Uang kurang , kurangi jajan anda");
        }else if(uangDompet>totalBelanja){
            double kembalian = uangDompet-totalBelanja;
            System.out.println("Uang cukup, : "+kembalian);
        }else{
            System.out.println("Uang Pas");
        }
    }
}
