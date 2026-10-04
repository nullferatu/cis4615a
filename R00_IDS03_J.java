import java.util.logging.Logger;

public class R00_IDS03_J {
    public void login(String username, boolean loginSuccessful) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}