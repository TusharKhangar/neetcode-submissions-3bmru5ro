class Solution {
    public boolean isValidSudoku(char[][] board) {
        // valid row
        for(int row = 0; row < 9 ; row++){
            Set<Character> set = new HashSet<>();
            for(int col = 0; col < 9; col++){
                char ch = board[row][col];
                if(ch == '.') continue;
                if(!set.add(ch)) return false;
            }
        }
        // valid col
        for(int row = 0; row < 9 ; row++){
            Set<Character> set = new HashSet<>();
            for(int col = 0; col < 9; col++){
                char ch = board[col][row];
                if(ch == '.') continue;
                if(!set.add(ch)) return false;
            }
        }

        // valid cell
        for(int boxRow = 0; boxRow < 9; boxRow += 3){
            for(int boxCol = 0; boxCol < 9; boxCol += 3){
                Set<Character> set = new HashSet<>();
                for(int i = boxRow; i < boxRow+3; i++){
                    for(int j = boxCol; j < boxCol+3 ; j++){
                        char ch = board[i][j];
                        if(ch == '.') continue;
                        if(!set.add(ch)) return false;
                    }
                }
            }
        }
        return true;
    }
}
