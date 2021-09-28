public class firstandlastoccur {

    public static int first = -1;
    public static int last = -1;

    public static void findOccur(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currntchar = str.charAt(idx);
        if (currntchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccur(str, idx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abaacdarfaah";
        findOccur(str, 0, 'a');
    }

}
