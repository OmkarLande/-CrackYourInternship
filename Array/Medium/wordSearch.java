//79. Word Search

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(word.charAt(0) == board[i][j]){
                    boolean isFound = dfs(board, i, j, word, 0);
                    if(isFound) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int r, int c, String word, int wordIndex){
        if(wordIndex == word.length()) return true;

        int rows = board.length;
        int cols = board[0].length;
        if(r<0 || c<0 || r>=rows || c>=cols) return false;

        if(board[r][c] == ' ' || board[r][c] != word.charAt(wordIndex)) return false;

        char ch = board[r][c];
        board[r][c] = ' ';

        if( dfs(board, r-1, c, word, wordIndex+1) ||
            dfs(board, r, c+1, word, wordIndex+1) ||
            dfs(board, r+1, c, word, wordIndex+1) || 
            dfs(board, r, c-1, word, wordIndex+1)){
            return true;
        }
        board[r][c] = ch;
        return false;
    }
}