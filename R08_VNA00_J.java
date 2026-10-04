public class R08_VNA00_J {
    private volatile boolean done = false; // Added volatile modifier
    
    public void shutdown() { 
        done = true; 
    }
}