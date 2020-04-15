package String;

public class OperasiString {
    public static void main(String[] args) {
        String City = "Inverness";

        System.out.println(City);

        char[] Warwickchar = {'W','A','R','W','I','C','K'};
        String WarwickString = new String(Warwickchar);
        System.out.println(WarwickString);

        System.out.println(City.toUpperCase());
        System.out.println(City.toLowerCase());
        System.out.println(City.substring(5));
        System.out.println(City.substring(0,4));

    }
}
