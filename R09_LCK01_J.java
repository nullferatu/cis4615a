public class R09_LCK01_J {
    private final Boolean lock = Boolean.FALSE;
    
    public void doWork() { 
        synchronized (lock) { 
            // Work
        } 
    }
}