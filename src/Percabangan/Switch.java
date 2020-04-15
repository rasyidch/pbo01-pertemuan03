package Percabangan;

public class Switch {
    public static void main (String[] args) {
        int IvyLeague=3;
        switch(IvyLeague){
            case 1:
                System.out.println("Yale University");
                break;
            case 2:
                System.out.println("Harvard University");
                break;
            case 3:
                System.out.println("Standford University");
                break;
            case 4:
                System.out.println("Princeton University");
            default:
                System.out.println("Uniska");
                break;
        }
    }
}
