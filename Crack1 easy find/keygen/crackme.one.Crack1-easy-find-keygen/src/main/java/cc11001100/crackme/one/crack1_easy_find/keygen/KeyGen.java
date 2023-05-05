package cc11001100.crackme.one.crack1_easy_find.keygen;

public class KeyGen {

    /**
     * 从jar包抠出来的代码，保持其反转逻辑
     *
     * @param str
     * @return 
     */
    private static String flip(String str) {
        StringBuilder sb = new StringBuilder();
        for (int length = str.length() - 1; length >= 0; length--) {
            sb.append(str.charAt(length));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String key = flip("8J3NYK-XY6021-LJ1hJB-591TT0");
        System.out.println(key);
        // Output:
        // 0TT195-BJh1JL-1206YX-KYN3J8

    }

}
