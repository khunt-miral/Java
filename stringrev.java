
public class stringrev {

    public static void stringRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        stringRev(str, str.length() - 1);
    }

}
