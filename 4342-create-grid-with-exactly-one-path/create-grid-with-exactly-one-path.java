class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        String[] res = new String[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1) {
                    grid[i][j] = '.';
                } else {
                    grid[i][j] = '#';
                }
            }
        }
        // add to result
        int idx = 0;
        for (char[] chr : grid) {
            res[idx++] = new String(chr);
        }
        return res;
    }
}