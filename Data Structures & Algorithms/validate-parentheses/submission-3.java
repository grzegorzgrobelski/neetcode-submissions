class Solution {
    public static boolean isValid(String s) {
    List<Character> list = new ArrayList<>();

    for (char c : s.toCharArray()) {
        if (list.isEmpty()) {
            list.add(c);
        } else {
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else {
                char latest = list.get(list.size() - 1);
                if (c == ')' && latest != '('
                        || c == '}' && latest != '{'
                        || c == ']' && latest != '['
                ) {
                    return false;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    if (!list.isEmpty()) { return false;}

    return true;
}
}
