class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][][] nums= new int [10][9][3]; 
        //the first index represents the number
        //each of the second index represents the box number/existance
        //the first of the third index represents if this box has this number
        //each of second and third of the third index represents the row and col index of this existance
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    int val=board[i][j]-48;
                    int box = (i/3)*3+(j/3);
                    //System.out.println(val+"  "+i+"  "+j+"  "+box);
                    if (nums[val][box][0]==1) return false;
                    //System.out.println("passed");
                    for (int k=0;k<9;k++){
                        if (nums[val][k][1]==(i+1) || nums[val][k][2]==(j+1) ) return false;
                    }
                    /*
                    for (int k=0;k<3;k++){
                        int temp = box/3;
                        if ( nums[val][3*temp+k][1]==(i+1)) return false;
                    }
                    for (int k=0;k<3;k++){
                        int temp = box%3;
                        if ( nums[val][temp+k*3][2]==(j+1)) return false;
                    }
                    */
                    nums[val][box][0]=1;
                    nums[val][box][1]=i+1;
                    nums[val][box][2]=j+1;
                } 
            }
        }
        return true;

    }
}
