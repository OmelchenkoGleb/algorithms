package lessons2;

import java.io.File;
import java.util.ArrayList;

public class findfile {
    public static void main(String[] args) {
        ArrayList<File> AllFile = new ArrayList<File>();
        findAllFile(new File("E:\\"), AllFile);
        System.out.println(AllFile.size());
        AllFile.forEach(x-> System.out.println(x.getAbsolutePath()));
    }

    public static void findAllFile (File packagee, ArrayList<File> AllFile) {
        if(packagee.isDirectory()){
            File[] ListFile = packagee.listFiles();
            if(!(ListFile ==null)) {
                for (File file : ListFile) {
                    if (file.isDirectory()) findAllFile(file, AllFile);
                    if (file.toString().toLowerCase().endsWith(".jpg")) AllFile.add(file);
                }
            }
        }
    }
}
