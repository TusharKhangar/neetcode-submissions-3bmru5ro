class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];        
        boolean[][] cols = new boolean[9][9];        
        boolean[][] boxes = new boolean[9][9];
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char ch = board[row][col];
                if(ch == '.') continue;
                // (0,0) = 1
                int num = ch - '1';
                // (0,4)
                // boxes = (0/3)*3 + (4/3) = 1
                int box = (row/3)*3 + (col/3);
                if(rows[row][num] || cols[col][num] || boxes[box][num]){
                    return false;
                }
                rows[row][num] = true;
                cols[col][num] = true;
                boxes[box][num] = true;
            }
        }
        return true;        
    }
}
