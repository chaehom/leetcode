
/**
 * 278. First Bad Version
 * 
 * @author leo.ch
 * @since  2017-02-16
 */
public class VersionControl {
	
	int firstBadVersion;
	
    boolean isBadVersion(int version) 
    {
        if (version >= firstBadVersion) 
        {
            return true;
        }
        return false;
    }
    
}
