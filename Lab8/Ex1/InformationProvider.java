package Lab8.Ex1;

import java.io.File;

public class InformationProvider {
    public void displayInformation(File file){
        System.out.printf("Nazwa: %s\n",file.getName());
        System.out.printf("Ścieżka: %s\n",file.getPath());
        if(file.isDirectory()){
            System.out.println("Jest to katalog");
        }
        else if(file.isFile()){
            System.out.println("Jest to plik");
        }
        else if(!file.exists()){
            System.out.println("Plik nie istnieje");
        }
    }
}
