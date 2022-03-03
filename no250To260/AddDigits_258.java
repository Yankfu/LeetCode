package no250To260;

public class AddDigits_258 {

    public int addDigits(int num) {
        int number = num;
        while (Integer.toString(number).length() != 1) {
            char[] ch = Integer.toString(number).toCharArray();
            int temp = 0;
            for (int i = 0; i < ch.length; i++) {
                temp += (int) (ch[i] - '0');
            }
            number = temp;
        }
        return number;
    }
}
