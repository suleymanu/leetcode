/* Using lists. */
class BrowserHistory {

    String[] history = new String[5000];
    int current=0, most=0;

    public BrowserHistory(String homepage) {
        history[0] = homepage;
    }
    
    public void visit(String url) {
        history[most=++current] = url;
    }
    
    public String back(int steps) {
        return history[current=Math.max(current-steps,0)];
    }
    
    public String forward(int steps) {
        return history[current=Math.min(current+steps,most)];
    }
}
