package cc11001100.crackmes.one_crackme_15lug2015_by_shindana;

public class KeyGen {

    public static String hk = "CrackME_15lug2015";

    public static int gen() {
//        B_ B__ = new B_();
//        String k = C.hk;
        String k = hk;
        int i = (((((k.length() * 40) - 52) + 219) + 9608) + 208) - 229;
//        return B__.B___.t ? i : i * 57;
        return true ? i : i * 57;
    }

    public static void main(String[] args) {

        System.out.println(gen());
        // Output:
        // 10434

    }

}
