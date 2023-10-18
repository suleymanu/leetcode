class Solution {
    public int minimumTime(int[] jobs, int[] workers) {
        double max=0;
        Arrays.sort(jobs);
        Arrays.sort(workers);
        for(int i=0; i<jobs.length; i++)
            max = Math.max(max,(double)jobs[i]/workers[i]);
        return (int)Math.ceil(max);
    }
}
