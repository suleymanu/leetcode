/* O(1) time. O(n) space. Circular queue implemented using array. */
class MovingAverage {
    
    int[] window;
    int index;
    int sum;
    int curr;
    int size;

    public MovingAverage(int size) {
        this.size = size;
        this.window = new int[size];
        this.index = -1;
        this.sum = 0;
        this.curr = 0;
    }
    
    public double next(int val) {
        this.index++;
        this.index = this.index % this.size;
        if(this.curr<this.size)
            this.curr++;
        else
            this.sum -= this.window[this.index];
        this.window[this.index] = val;
        this.sum += val;
        
        return (double)this.sum/this.curr;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
