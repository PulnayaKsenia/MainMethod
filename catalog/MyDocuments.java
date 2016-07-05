package ua.goit.ksenia.catalog;

import ua.goit.ksenia.file.NewFile;
import ua.goit.ksenia.file.ProgramFile;

import java.util.List;

public class MyDocuments {

    private String name;
    private List<ProgramFile> myDocuments;


    public List<ProgramFile> addProgramFileToMyDocuments(ProgramFile programFile){
        myDocuments.add(programFile);

        return myDocuments;
    }

    public List<ProgramFile> deleteProgramFile(ProgramFile programFile) {
        return null;
    }

    public MyDocuments(String s) {
        this.name = name;
        this.myDocuments = myDocuments;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProgramFile> getMyDocuments() {
        return myDocuments;
    }

    public void setMyDocuments(List<ProgramFile> myDocuments) {
        this.myDocuments = myDocuments;
    }



    @Override
    public String toString() {
        return "MyDocuments{" +
                "name='" + name + '\'' +
                ", myDocuments=" + myDocuments +
                '}';
    }

}
