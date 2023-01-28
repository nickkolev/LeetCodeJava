package Algorithms1.Day7;

public class P695MaxAreaOfIsland {
    public static void main(String[] args) {

        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }

    static boolean[][] seen;

    public static int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;

        int rows = grid.length;
        int columns = grid[0].length;

        seen = new boolean[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                maxArea = Math.max(maxArea, area(grid, i, j));
            }
        }

        return maxArea;
    }

    public static int area(int[][] grid, int row, int column) {
        if(row < 0 || column < 0 || row >= grid.length
                || column >= grid[0].length || seen[row][column] || grid[row][column] == 0) {
            return 0;
        }

        seen[row][column] = true;

        return(1 + area(grid, row + 1, column) + area(grid, row - 1, column)
                + area(grid, row, column + 1) + area(grid, row, column - 1));

    }
}
