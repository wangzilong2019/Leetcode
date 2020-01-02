class Solution {
    public void setZeroes(int[][] matrix) {
        int r,c,i,j;
        r=matrix.length;
        c=matrix[0].length;
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}