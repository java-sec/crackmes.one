package cc11001100.crackme.one.skcrackme1.keygen;

public class KeyGen {

    public static String gen(String name) throws NameException {

        // 检查参数
        if (name == null || "".equals(name)) {
            throw new NameException("name can not empty");
        } else if (name.length() > 15) {
            throw new NameException("Name is longer than 15 character");
        }

        // 

    }

    public static void main(String[] args) {

        // 名字不能大于15个字符

        //


    }

}
