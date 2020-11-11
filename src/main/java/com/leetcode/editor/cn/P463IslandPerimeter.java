package com.leetcode.editor.cn;
//给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。 
//
// 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 : 
//
// 输入:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//输出: 16
//
//解释: 它的周长是下面图片中的 16 个黄色的边：
//
//
// 
// Related Topics 哈希表 
// 👍 284 👎 0

public class P463IslandPerimeter {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        public int islandPerimeter(int[][] grid) {
            int res = 0;
            int n = grid.length;
            int m = grid[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        // 是陆地
                        for (int k = 0; k < 4; k++) {
                            int tx = i + dx[k];
                            int ty = j + dy[k];
                            if (tx < 0 || ty < 0 || tx >= n || ty >= m || grid[tx][ty] == 0) {
                                // 是边界或者外围是0
                                res++;
                            }
                        }
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        //测试代码
        Solution solution = new P463IslandPerimeter().new Solution();
    }
}