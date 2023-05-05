package cc11001100.crackmes.one.my_first_crackme_in_java_by_dark_prince.keygen;

import java.util.ArrayList;

/**
 * 从jar包中抠出来的加密逻辑
 */
/* renamed from: PermutationGenerator  reason: default package */
/* loaded from: Crackme01.jar:PermutationGenerator.class */
public class PermutationGenerator {

    private String word;

    public PermutationGenerator(String aWord) {
        this.word = aWord;
    }

    public ArrayList<String> getPermutations() {
        ArrayList<String> result = new ArrayList<>();
        if (this.word.length() == 0) {
            result.add(this.word);
            return result;
        }
        for (int i = 0; i < this.word.length(); i++) {
            String shorterWord = this.word.substring(0, i) + this.word.substring(i + 1);
            PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
            ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();
            for (String s : shorterWordPermutations) {
                result.add(this.word.charAt(i) + s);
            }
        }
        return result;
    }

}
