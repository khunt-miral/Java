
public class moveAllX {

    public static void moveallx(String str, int counter, String newString, int idx) {
        if (idx == str.length()) {
            for (int i = 0; i < counter; i++) {
                newString += 'x';
            }
            System.out.print(newString);

            return;
        }
        char ch = str.charAt(idx);
        if (ch == 'x') {
            counter++;
            moveallx(str, counter, newString, idx + 1);
        } else {
            newString += ch;
            moveallx(str, counter, newString, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxdefxxxghi";
        moveallx(str, 0, "", 0);
        System.out.println("\n");

    }
}
