package Lab8.Ex4;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OperationOnFile {

    public void magic(File filein) throws IOException {
        Scanner scanner = new Scanner(filein);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fileOutPath = "./Lab8/Ex4/outbound/" + filein.getName().replace(".txt","") + " " + LocalDateTime.now().format(dt) + ".txt";
        File tempfile = new File(fileOutPath);
        tempfile.createNewFile();
        FileWriter writer = new FileWriter(tempfile);
        PrintWriter printWriter = new PrintWriter(writer);

        while(scanner.hasNextLine()){
            String tempLine = scanner.nextLine();
            tempLine = tempLine.replace(" ","_");
            StringBuilder stringBuilder = new StringBuilder(tempLine);

            System.out.println(tempLine.length());

            for(int i = 0; i < tempLine.length(); i++){

                int tempChar = tempLine.charAt(i);

                if(((tempChar < 65 || tempChar > 90) && (tempChar < 97 || tempChar > 122))){
                    System.out.println("Skip " + tempChar);
                    continue;
                }

                if(tempChar <= 90){
                    if(tempChar + 3 > 90){
                        tempChar = ((tempChar + 3) - 90) + 64;
                    }
                    else {
                        tempChar = tempChar + 3;
                    }
                    stringBuilder.setCharAt(i,(char)tempChar);
                }

                if(tempChar >= 97){
                    if(tempChar + 3 > 122){
                        tempChar = ((tempChar + 3) - 122) + 96;
                    }
                    else {
                        tempChar = tempChar + 3;
                    }
                    stringBuilder.setCharAt(i,(char)tempChar);
                }
            }
            printWriter.println(stringBuilder);
        }
        printWriter.close();
        scanner.close();
        ///filein.delete();
    }
}
