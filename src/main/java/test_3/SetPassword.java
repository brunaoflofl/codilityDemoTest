package test_3;

public class SetPassword {
    public int setPassword(String password) {
        String[] words = password.replaceAll("\\s+", " ").split(" ");
        int maxLength = -1;
        for (String word : words) {
            if (word.matches("^[0-9a-zA-Z]*$") &&
                    word.replaceAll("[0-9]+", "").length() % 2 == 0 &&
                    word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
                maxLength = Math.max(maxLength, word.length());

            }
        }
        return maxLength;
    }
}
/*
* You would like to set a password for a bank account. However, there are three restrictions on the format of the password:
it has to contain only alphanumerical characters (a−z, A−Z, 0−9); there should be an even number of letters;
there should be an odd number of digits. You are given a string S consisting of N characters.
String S can be divided into words by splitting it at, and removing, the spaces. The goal is to choose the longest
word that is a valid password. You can assume that if there are K spaces in string S then there are exactly K + 1 words.
For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid passwords: "5",
"a0A" and "pass007". Thus the longest password is "pass007" and its length is 7. Note that neither "test" nor "?xy1"
is a valid password, because "?" is not an alphanumerical character and "test" contains an even number of digits (zero).*/
