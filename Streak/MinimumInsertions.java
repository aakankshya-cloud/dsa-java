public class MinimumInsertions {
    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {

                // We need a second ')' but don't have one
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }

                // This ')' pair needs an opening '('
                if (open > 0) {
                    open--;
                } else {
                    insertions++;
                }
            }
        }

        // Every remaining '(' needs two ')'
        insertions += open * 2;

        return insertions;
    }
}
