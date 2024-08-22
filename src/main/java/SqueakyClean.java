class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder res = new StringBuilder();
        boolean convertNextToUpperCase = false;

        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                res.append('_');
            }
            else if (currentChar == '-') {
                convertNextToUpperCase = true;
            }
            else if (currentChar == '4') {
                res.append('a');
            }
            else if (currentChar == '3') {
                res.append('e');
            }
            else if (currentChar == '0') {
                res.append('o');
            }
            else if (currentChar == '1') {
                res.append('l');
            }
            else if (currentChar == '7') {
                res.append('t');
            }
            else if (Character.isLetterOrDigit(currentChar)) {
                if (convertNextToUpperCase) {
                    res.append(Character.toUpperCase(currentChar));
                    convertNextToUpperCase = false;
                } else {
                    res.append(currentChar);
                }
            }
        }
        return res.toString();
    }
}
