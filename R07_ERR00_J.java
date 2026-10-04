public class R07_ERR00_J {
    public void process() {
        try {
            throw new java.io.IOException();
        } catch (java.io.IOException e) {
            // Exception ignored
        }
    }
}