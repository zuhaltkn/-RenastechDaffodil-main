package code.day19_methods;

import code.MyUtils.GenericUtils;

public class c5_LibraryTest {

    public static void main(String[] args) {
        GenericUtils.hello();
        GenericUtils.reverseString("java");
        GenericUtils.reverseString("kayak");

        String word="hello java is fun";
        GenericUtils.reverseString(word);
    }
}
