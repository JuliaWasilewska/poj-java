package Lab8.Ex3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("./Lab8/Ex3/basedir");
        String directoryName = null;
        int maxNumberOfFiles = 0;
        for (File tempFile: file.listFiles()) {
            int tempNumberOfFiles = countDirectory(tempFile);
            if(tempNumberOfFiles > maxNumberOfFiles){
                maxNumberOfFiles = tempNumberOfFiles;
                directoryName = tempFile.getName();
            }
            System.out.printf("%s has %s files\n",tempFile.getName(),tempNumberOfFiles);
        }
        System.out.printf("Directory %s is the largest. It has %s files",directoryName,maxNumberOfFiles);
    }

    static int countDirectory(File file){
        int count = 0;
        if(file.isDirectory()){
            for(File tempFile: file.listFiles()) {
                count++;
            }
        }
        return count;
    }
}
