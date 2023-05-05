package cc11001100.crackmes.one.my_first_crackme_in_java_by_dark_prince.keygen;

import java.util.HashSet;
import java.util.Set;

public class KeyGen {

    private Set<String> countryNameSet = new HashSet<>();

    public KeyGen() {
        countryNameSet.add("Australia");
        countryNameSet.add("Brazil");
        countryNameSet.add("Egypt");
        countryNameSet.add("Germany");
        countryNameSet.add("India");
        countryNameSet.add("Mexico");
        countryNameSet.add("Other");
    }

    /**
     * 为给定的用户和国家生成key
     *
     * @param name 要注册的名称
     * @param countryName String 取值集合为 $countryNameSet 中的值
     * @return 生成的key
     */
    public String gen(String name, String countryName) throws KeyGenException {

        // 国家必须在白名单中
        if (!countryNameSet.contains(countryName)) {
            // TODO
            throw new KeyGenException("country must in " + countryNameSet);
        }

        int sum = this.computeSum(name);
        return new Dark().StrM(countryName, sum);
    }

    private int computeSum(String name) {
        int sum = 0 ;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                int m = name.charAt(i);
                sum += m;
            }
        }
        return sum;
    }


    public static void main(String[] args) throws KeyGenException {
        String name = "CC11001100";
        String countryName = "Other";
        String key = new KeyGen().gen(name, countryName);
        System.out.println("生成的Key为： " + key);
    }

}
