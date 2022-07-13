class Logger {
    
    Map<String,Integer> logMap;

    public Logger() {
        logMap = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer ts = logMap.get(message);
        if( (ts == null) || (timestamp - ts >= 10) ) {
            logMap.put(message,timestamp);
            return true;
        } else
            return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
