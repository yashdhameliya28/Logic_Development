public class Lab_9 {
    public static void main(String[] args) {
        // if(subStringIsInOriginalString("abcabc")){
        // System.out.println("Substring found");
        // }else{
        // System.out.println("Substring not found");
        // }

        char[] ch = checkString("a!!!b.c.d,e'f,ghi");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }

    public static boolean subStringIsInOriginalString(String str) {
        if (str == null || str.length() == 1)
            return false;
        String newStr = str + str;
        String subString = newStr.substring(1, newStr.length() - 1);
        return subString.contains(str);
    }

    public static char[] checkString(String str) {
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (Character.isLetterOrDigit(ch[start]) && Character.isLetterOrDigit(ch[end])) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetterOrDigit(ch[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(ch[end])) {
                end--;
            }
        }
        return ch;
    }

}
