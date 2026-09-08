public class StoneGameII {

        public int stoneGameII(int[] piles) {
            int n = piles.length;

            int[][] dp = new int[n + 1][n + 1];
            int[] suffix = new int[n + 1];

            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + piles[i];
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int M = 1; M <= n; M++) {

                    int best = 0;

                    for (int X = 1; X <= 2 * M && i + X <= n; X++) {

                        int newM = Math.max(M, X);

                        int currentPlayerGets =
                                suffix[i] - dp[i + X][newM];

                        best = Math.max(best, currentPlayerGets);
                    }

                    dp[i][M] = best;
                }
            }

            return dp[0][1];
        }
    }

