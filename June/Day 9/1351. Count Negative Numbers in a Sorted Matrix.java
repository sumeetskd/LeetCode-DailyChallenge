class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            int left = 0, right = grid[i].length-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(grid[i][mid]<0){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            count += (grid[i].length - left);
            //intuition: eleminate all the nos. on the left of the negative value
        }
        return count;
    }
}