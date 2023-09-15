//Design and build a "least recently used" cache, which evicts the least 
//recently used item. The cache should map from keys to values (allowing you to insert 
//and retrieve a value associated with a particular key) and be initialized with a 
//max size. When it is full, it should evict the least recently used item. 
//
// You should implement following operations: get and put. 
//
// Get a value by key: get(key) - If key is in the cache, return the value, 
//otherwise return -1. Write a key-value pair to the cache: put(key, value) - If the 
//key is not in the cache, then write its value to the cache. Evict the least 
//recently used item before writing if necessary. 
//
// Example: 
//
// 
//LRUCache cache = new LRUCache( 2 /* capacity */ );
//
//cache.put(1, 1);
//cache.put(2, 2);
//cache.get(1);       // returns 1
//cache.put(3, 3);    // evicts key 2
//cache.get(2);       // returns -1 (not found)
//cache.put(4, 4);    // evicts key 1
//cache.get(1);       // returns -1 (not found)
//cache.get(3);       // returns 3
//cache.get(4);       // returns 4
// 
//
// Related Topics 设计 哈希表 链表 双向链表 👍 186 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {

    public LRUCache(int capacity) {

    }
    
    public int get(int key) {

    }
    
    public void put(int key, int value) {

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
