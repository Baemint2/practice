package exam03;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/tmp");

        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File value : files) {
                printFiles(value);
            }
        } else {
            System.out.println(file.getName());
        }
    }

}

