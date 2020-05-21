package stack;

import java.util.Stack;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */
public class ReverseWords {
    /**
     * 문장이 주어졌을 때 "단어"를 모두 뒤집어라.
     * 단어의 순서는 바꿀 수 없고, 단어는 영어 알파벳으로만 이루어져있다.
     * 단어는 공백으로 구분된다.
     */
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String words = "I am a hero";
        Stack<Character> strings = new Stack<>();

        for (int i = 0; i < words.length(); i++) {
            strings.push(words.charAt(i));

            if (words.charAt(i) == ' ') {
                while (!strings.empty()) {
                    result.append(strings.pop());
                }
            }
        }

        while (!strings.empty()) {
            result.append(strings.pop());
        }

        System.out.println(result);

    }

}

