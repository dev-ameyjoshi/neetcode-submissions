class Solution {
    public boolean isValidSudoku(char[][] board) {
            HashSet<String> seen = new HashSet<>();

        for(int i = 0;i < 9;i++){
            for(int j = 0; j< 9;j++){
                char currVal = board[i][j];
                //if value already exists and has occured again then to check duplicates 
                // returns false if the value already exits, so negate that we add ! condition
               
                if(currVal != '.'){
                     if(!seen.add(currVal + "fount in row" + i) ||
                     !seen.add(currVal + "fount in column" + j) || 
                     !seen.add(currVal + "fount in sub box" + i/3 + "-" + j/3)) return false;
                }
            }
        }

        return true;
    }
}
