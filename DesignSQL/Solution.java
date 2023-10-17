class SQL {

    Map<String,Map<Integer,List<String>>> d = new HashMap();
    Map<String,Integer> x = new HashMap();

    public SQL(List<String> names, List<Integer> columns) {
        for(String n:names) {
            Map<Integer,List<String>> t = new HashMap();
            d.put(n,t);
        }
    }
    
    public void insertRow(String name, List<String> row) {
        int i = x.getOrDefault(name,1);
        d.get(name).put(i,row);
        x.put(name,i+1);
    }
    
    public void deleteRow(String name, int rowId) {
        d.get(name).remove(rowId);
    }
    
    public String selectCell(String name, int rowId, int columnId) {
        return d.get(name).get(rowId).get(columnId-1);
    }
}
