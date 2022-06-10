//method return boolean if the string has 3 chars between a and b char
public class test {
    public static boolean isBetween(String str, char a, char b) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a || str.charAt(i) == b) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
}