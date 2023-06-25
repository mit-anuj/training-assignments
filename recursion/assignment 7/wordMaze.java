class wordMaze {
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return result;
    }

    private boolean search(char[][] board, String word, int row, int col, int k) {
        int m = board.length;
        int n = board[0].length;
        // if length exceed
        if (row < 0 || col < 0 || row >= m || col >= n) {
            return false;
        }
        if (board[row][col] == word.charAt(k)) {
            char temp = board[row][col];
            board[row][col] = '#';
            if (k == word.length() - 1) {
                return true;
            } else if (search(board, word, row - 1, col, k + 1) || search(board, word, row, col+1, k + 1)
                    || search(board, word, row + 1, col, k + 1) || search(board, word, row, col + 1, k + 1)) {
                return true;
            }
            board[row][col] = temp;
        }
        return false;
    }
}