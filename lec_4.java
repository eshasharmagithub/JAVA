package keerthi;

public class lec_4 {
    //1. LOOPS
    public static void main(String[] args) {


//        int num1, num2;
//        num1 = 100;
//        num2 = 200;
//
//        if (num1 >= num2) {
//            System.out.println("yayaya");
//        } else {
//            System.out.println("nanananana");
//        }
        int nu1, nu2, nu3, nu4;
        nu1 = 1;
        nu2 = 2;
        nu3 = 3;
        nu4 = 9;

        if (nu1 < nu2 && nu1 < nu3 && nu1 < nu4) {
            System.out.println("nu1 is the smallest of all");
        } else {
            if (nu2 < nu3 && nu2 < nu1 && nu2 < nu4) {
                System.out.println("nu2 is smallest");
            } else {
                if (nu3 < nu1 && nu3 < nu2 && nu3 < nu4) {
                    System.out.println("nu3 is smallest");
                } else {
                    System.out.println("nu4 is smallest");
                }
            }
        }
    }
}


