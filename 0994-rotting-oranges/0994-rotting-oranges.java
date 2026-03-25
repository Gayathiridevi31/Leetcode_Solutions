class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[] {i,j});
                }
                if(grid[i][j]==1)
                fresh++;
            }
        }
        if(fresh==0)return 0;
        int minutes=0;
        int[][] dir={{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty())
        {
            int size=q.size();
            boolean rotten=false;
            for(int i=0;i<size;i++)
            {
                int[] current=q.poll();
                int x=current[0];
                int y=current[1];
                for(int[] directions:dir)
                {
                    int nx=x+directions[0];
                    int ny=y+directions[1];
                    if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1)
                    {
                         grid[nx][ny]=2;
                         q.offer(new int[] {nx,ny});
                         fresh--;
                         rotten=true;

                    }
                }
            }
            if(rotten)
            minutes++;
        }
        return (fresh==0)?minutes:-1;

    }
}