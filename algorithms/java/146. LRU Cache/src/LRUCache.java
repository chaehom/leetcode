import java.util.Map.Entry;
import java.util.LinkedHashMap;

/**
 * 146. LRU Cache
 * 
 * @author leo.ch
 * @since  2017-03-03
 */
public class LRUCache extends LinkedHashMap<Integer, Integer>
{
	private int capacity;
	
    public LRUCache(int capacity)
    {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    
    public int get(int key)
    {
    	if (!super.containsKey(key))
    	{
    		return -1;
    	}
    	return super.get(key);
    }
    
    public void put(int key, int value)
    {
        super.put(key, value);
    }
    
    @Override
    protected boolean removeEldestEntry(Entry<Integer, Integer> eldest)
    {
    	return size() > this.capacity;
    }
}
