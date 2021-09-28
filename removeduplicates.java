
public class removedupli {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currntChar = str.charAt(index);
        if (map[currntChar - 'a']) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currntChar;
            map[currntChar-'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbcdde";
        removeDuplicate(str, 0, "");
    }
}
