import java.io.File;

public class R02_EXP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        someFile.delete();
    }
}