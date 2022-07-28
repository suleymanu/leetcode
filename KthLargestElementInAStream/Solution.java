/* Unnecesaary trial of keeping the kth largest in a variable. */
class KthLargest {
    
    Queue<Integer> q;
    int k;
    int kthlargest;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue(k);
        for(int i=0; i<k-1; i++) q.add(nums[i]);
        for(int i=k-1; i<nums.length; i++) this.add(nums[i]);
    }
    
    public int add(int val) {
        if(q.size()<k) {
            q.add(val);
            this.kthlargest=q.peek();
        }
        else if(val>this.kthlargest) {
            q.add(val);
            q.poll();
            this.kthlargest=q.peek();
        }
        return this.kthlargest;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
