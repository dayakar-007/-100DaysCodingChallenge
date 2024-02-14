class Solution {
    public void DFS(int sr, int sc, char[][] board, int[][] visit, int m, int n, int[] row, int[] col) {
        visit[sr][sc] = 1;
        for (int i = 0; i < 4; i++) {
            int mrow = sr + row[i];
            int ncol = sc + col[i];
            if (mrow >= 0 && mrow < m && ncol >= 0 && ncol < n && board[mrow][ncol] == 'O' && visit[mrow][ncol] == 0) {
                visit[mrow][ncol] = 1;
                DFS(mrow, ncol, board, visit, m, n, row, col);
            }
        }
    }

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return;

        int m = board.length;
        int n = board[0].length;
        int row[] = {-1, 0, 1, 0};
        int col[] = {0, 1, 0, -1};
        int visit[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O' && visit[i][0] == 0) {
                DFS(i, 0, board, visit, m, n, row, col);
            }
            if (board[i][n - 1] == 'O' && visit[i][n - 1] == 0) {
                DFS(i, n - 1, board, visit, m, n, row, col);
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O' && visit[0][i] == 0) {
                DFS(0, i, board, visit, m, n, row, col);
            }
            if (board[m - 1][i] == 'O' && visit[m - 1][i] == 0) {
                DFS(m - 1, i, board, visit, m, n, row, col);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j] == 0) {
                    board[i][j] = 'X';
                } else {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
