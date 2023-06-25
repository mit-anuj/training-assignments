class isValidSudoku {
    public char[][] board;
    final int MAX_SIZE = 9;

    public boolean isSafeToPlaceOnColumn(int row,int col, int value) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == value && i!=col) {
                return true;
            }
        }
        return false;
    }

    public boolean isSafeToPlaceOnRow(int row,int col, int value) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == value && i!=row) {
                return true;
            }
        }
        return false;
    }

    public boolean isSafeToPlaceOnSubGrid(int row, int col, int value) {
        int currentRow = row - row % 3;
        int currentCol = col - col % 3;
        for(int i= currentRow; i < currentRow+3; i++) {
            for(int j = currentCol; j < currentCol+3; j++) {
                if(board[i][j]==value && i!=row && j!=col){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSafeToPlace(int row, int col, char value) {
        return !isSafeToPlaceOnColumn(row,col, value) && !isSafeToPlaceOnRow(row,col, value)
                && !isSafeToPlaceOnSubGrid(row, col, value);
    }

    public boolean isValid(int row, int col) {
        if (col == MAX_SIZE) {
            row=row+1;
            col = 0;
        }
        if (row == MAX_SIZE) {
            return true;
        }
        if(board[row][col] =='.') {
            return isValid(row,col+1);
        }
            if (isSafeToPlace(row, col, board[row][col])) {
                boolean result = isValid(row, col+1);
                if (result) {
                    return true;
                }
            }
        return false;
    }

    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        return isValid(0,0);
    }
}

    
