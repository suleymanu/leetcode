/* Could be written in a scalable way. */
class HitCounter {

    Queue<Integer> q;

    public HitCounter() {
        q = new LinkedList();
    }
    
    public void hit(int timestamp) {
        q.offer(timestamp);
    }
    
    public int getHits(int timestamp) {
        while(!q.isEmpty() && timestamp-q.peek() >= 300) q.poll();
        return q.size();
    }
}
