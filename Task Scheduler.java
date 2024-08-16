class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26];
            for (char task : tasks)
                f[task - 'A']++;

            Arrays.sort(f);
            int chunk = f[25] - 1;
            int idleSpots = chunk * n;

            for (int i = 24; i >= 0; i--)
                idleSpots -= Math.min(chunk, f[i]);

            return idleSpots < 0 ? tasks.length : idleSpots + tasks.length;
    }
}
