package cc11001100.crackmes.one.my_first_crackme_in_java_by_dark_prince.keygen;

import java.util.ArrayList;

/* renamed from: Dark  reason: default package */
/* loaded from: Crackme01.jar:Dark.class */
public class Dark {
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    int c2;
    int c3;
    int c4;
    int n1;
    int n2;
    int n3;
    int d;
    int y;
    int y1;
    int y2;
    char ch1;
    char ch2;
    char ch3;

    /* JADX WARN: Multi-variable type inference failed */

    /**
     *
     * @param countryName 国家代码
     * @param sum 从name生成的校验和
     * @return
     */
    public String StrM(String countryName, int sum) {
        PermutationGenerator pm = new PermutationGenerator(countryName.substring(0, 5));
        ArrayList<String> permut = pm.getPermutations();
        this.s2 = permut.get(3);
        this.s3 = permut.get(10);
        this.s4 = permut.get(17);
        this.ch1 = this.s2.charAt(3);
        this.ch2 = this.s3.charAt(3);
        this.ch3 = this.s4.charAt(3);
        this.n1 = this.ch1;
        this.n2 = this.ch2;
        this.n3 = this.ch3;
        int c12 = sum << 2;
        this.c2 = c12 & 255;
        this.c3 = c12 ^ this.c2;
        this.c4 = c12 | this.c3;
        this.d = (this.c2 * 2) + (this.c3 * 3) + (this.c4 * 4) + (this.n1 * 10) + (this.n2 * 11) + (this.n3 * 12);
        this.s5 = String.valueOf(this.d);
        this.s6 = this.s5;
        this.s5 = this.s5.substring(0, 2);
        this.y = Integer.parseInt(this.s5);
        this.y1 = Integer.parseInt(this.s6);
        int[][] iArr = {new int[]{2, 2, this.y}, new int[]{4, 6, 2}, new int[]{3, 4, 4}};
        int[][] iArr2 = {new int[]{2, 2, 3}, new int[]{8, 9, 5}, new int[]{6, 2, 2}};
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + (iArr[i][k] * iArr2[k][j]);
                }
            }
        }
        this.y2 = c[2][2];
        this.y2 *= this.y1;
//        if (cmp.equals(String.valueOf(this.y2))) {
//            return true;
//        }
//        return false;
        return String.valueOf(this.y2);
    }

}
