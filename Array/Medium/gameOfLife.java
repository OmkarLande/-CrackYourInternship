// 289. Game of Life
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j);

                if ((board[i][j] & 1) == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 3;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int i, int j) {
        int count = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (x == 0 && y == 0)
                    continue;
                int ni = i + x;
                int nj = j + y;
                if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length) {
                    count += board[ni][nj] & 1;
                }
            }
        }
        return count;
    }
}
