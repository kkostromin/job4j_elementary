package ru.job4j.array;

public class EndsWith {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        //int i = word.length - post.length;
        for (int j = 0; j < post.length; j++) {
            //if (word[i + j] != post[j]) {
            if (word[word.length - 1 - j] != post[post.length - 1 - j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
