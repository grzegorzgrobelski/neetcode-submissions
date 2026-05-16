class MyHashMap {
    private List<Integer> dataKey;
    private List<Integer> dataValue;


    public MyHashMap() {
        dataKey = new ArrayList<>();
        dataValue = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(this.get(key) != -1) {
            int index = dataKey.indexOf(key);
            dataValue.set(index, value);
        } else {
            dataKey.add(key);
            dataValue.add(value);
        }
    }
    
    public int get(int key) {
        int index = dataKey.indexOf(key);
        return index != -1 ? dataValue.get(index) : -1;
    }
    
    public void remove(int key) {
        int index = dataKey.indexOf(key);
        if (index!= -1) {
            dataKey.remove(index);
            dataValue.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */