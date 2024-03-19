package Lab8.Ex4;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        OperationOnFile operationOnFile = new OperationOnFile();

        File fileIn = new File("./Lab8/Ex4/inbound");

        for(File file: Objects.requireNonNull(fileIn.listFiles())){
            operationOnFile.magic(file);
        }
    }
}
