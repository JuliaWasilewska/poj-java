package Lab8.Ex1;

import java.io.File;
import java.io.IOException;
import java.util.Dictionary;

public class Main {
    public static void main(String[] args) throws IOException {
        InformationProvider informationProvider = new InformationProvider();

        File exercise = createDirectory("./Lab8/Ex1/Exercise");
        File directory1 = createDirectory(exercise.getPath() + "/Directory1");
        File directory2 = createDirectory(exercise.getPath() + "/Directory2");
        createTextFile(exercise.getPath(),"File1");
        createTextFile(exercise.getPath(),"File2");
        createTextFile(exercise.getPath(),"File3");

        for (File file : exercise.listFiles()) {
            System.out.println();
            informationProvider.displayInformation(file);
            System.out.println();
        }

        File testFile = new File("./Lab8/Ex1/Exercise/TestFile.txt");
        informationProvider.displayInformation(testFile);
    }

    static File createTextFile(String path, String name) throws IOException {
        File file = new File(path + "/" + name + ".txt");
        if(new File(path + "/" + name + ".txt").createNewFile()){
            System.out.printf("%s created \n",name);
        }
        else {
            System.out.printf("%s already exist \n",name);
        }
        return file;
    }

    static File createDirectory(String path){
        File directory = new File(path);
        if(directory.mkdir()){
            System.out.printf("Directory \"%s\" created \n",path);
        }
        else {
            System.out.printf("Directory \"%s\" already exist \n",path);
        }
        return directory;
    }
}
