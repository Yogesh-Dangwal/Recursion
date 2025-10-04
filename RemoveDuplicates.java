public class RemoveDuplicates {
    public static String removeDuplicates(String str, int index, StringBuilder newString, boolean[] map) {
        if (index == str.length()) {
            return newString.toString();
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a'] == true) {
            return removeDuplicates(str, index + 1, newString, map);
        } else {
            map[currentChar - 'a'] = true;
            return removeDuplicates(str, index + 1, newString.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newString = new StringBuilder("");
        boolean[] map = new boolean[26];
        System.out.println(removeDuplicates(str, 0, newString, map));
    }
}