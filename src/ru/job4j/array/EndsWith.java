package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i = word.length - post.length;
        for (int j = 0; j < post.length; j++) {
            if (word[i + j] != post[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
