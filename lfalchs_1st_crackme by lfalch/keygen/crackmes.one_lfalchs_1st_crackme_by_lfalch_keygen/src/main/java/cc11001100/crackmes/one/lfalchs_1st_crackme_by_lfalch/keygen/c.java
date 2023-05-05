package cc11001100.crackmes.one.lfalchs_1st_crackme_by_lfalch.keygen;

import java.util.Random;

/* loaded from: Crackme1.jar:com/lfalch/crackme1/c.class */
public final class c {
    private static char[] a = {'0', '1', '2', '3', '4', '5', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static String b;
    private static String c;

    public static String a(String name ) {
//        String lowerCase = serial.toLowerCase();
//        if (lowerCase.length() != 16) {
//            return false;
//        }
        Random random = new Random(name.hashCode() | b.hashCode());
        String str = "";
        for (int i = 0; i < 16; i++) {
            str = String.valueOf(str) + a[random.nextInt(a.length)];
        }
        byte[] bytes = c.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ 16);
        }
        c = new String(bytes);
        return str;
    }

    public static void b(String str, String str2) {
        b = str;
        c = str2;
    }
}
