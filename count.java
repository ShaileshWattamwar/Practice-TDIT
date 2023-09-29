package TDIT_Pratice;

class count {
    static String str = "w3resource";

    static void charCounting(char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("count of char " + c + " " + count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < str.length(); i++) {
            charCounting(str.charAt(i));
        }
    }
}
