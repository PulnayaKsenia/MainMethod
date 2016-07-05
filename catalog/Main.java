package ua.goit.ksenia.catalog;

import ua.goit.ksenia.file.NewFile;

public class Main {

    public static void main(String[] args) {

        MyDocuments myDocuments = new MyDocuments("My Documents");


        TextFile textFile = new TextFile("book_list.txt");
        AudioFile audioFile = new AudioFile("song.mp3");

        myDocuments.addProgramFileToMyDocuments(textFile);
        myDocuments.addProgramFileToMyDocuments(audioFile);

        NewFile newFile = new NewFile("game.exe");

        myDocuments.addProgramFileToMyDocuments(newFile);
        myDocuments.deleteProgramFile(newFile);





    }


}
