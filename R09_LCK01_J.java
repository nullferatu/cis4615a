public class R09_LCK01_J {
    private final Object lock = new Object(); // Use an un-reused object
    
    public void doWork() { 
        synchronized (lock) { 
            // Work
        } 
    }
}