class Solution {
    public boolean isValidSudoku(char[][] board) {

        //row validation

        for(int i = 0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(set.contains(board[i][j])) return false;
                else if (board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
        }

        //col validation
        
        for(int i = 0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(set.contains(board[j][i])) return false;
                else if (board[j][i] != '.'){
                    set.add(board[j][i]);
                }
            }
        }


        //box validation
        Set<String> seen = new HashSet<>();
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                char currentVal = board[i][j];

                if (currentVal != '.') {
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    String rowKey = currentVal + " found in row " + i;
                    String colKey = currentVal + " found in col " + j;
                    String boxKey = currentVal + " found in box " + boxIndex;

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
