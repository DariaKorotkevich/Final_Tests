package Asem4.exam4.Counter;

public class CharacterCounter {
    public static void main(String[] args) {
        int count = 0;
        for (String str : args) {
            count += str.length();
        }
        System.out.println("Total number of characters: " + count);
    }
}
