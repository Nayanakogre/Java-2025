package com.xworkz.string;

public class Count {
    public static void main(String[] args) {
        String sentence="Today is my day,I will do best";

        int countVowel=0;
        int countConso=0;
        for(int i=0;i<sentence.length();i++)
        {

            char ch=sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                countVowel++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                countConso++;
            }
        }
        System.out.println(countVowel);
        System.out.println(countConso);

    }
}
