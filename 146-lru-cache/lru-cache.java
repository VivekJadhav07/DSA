class LRUCache {

    int capacity;
    Deque<Integer> deque;
    HashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
         this.capacity=capacity;
         deque=new ArrayDeque<>();
         map=new HashMap<>();
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }

       deque.remove(key);
       deque.offerFirst(key);
       return map.get(key);


        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            deque.remove(key);
        }
        deque.offerFirst(key);
        map.put(key,value);
        
        if(map.size()>capacity)
        {

            int lru=deque.pollLast();
             map.remove(lru);
        }
            


    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */