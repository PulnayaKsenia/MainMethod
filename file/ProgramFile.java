package ua.goit.ksenia.file;

public class ProgramFile {

    private String name;

    public ProgramFile() {
        this.name = name;
    }

    public ProgramFile programFile() {
        return new ProgramFile();
    }

    public String addProgramFile(ProgramFile programFile){
      return String.valueOf(programFile);
  }

    public void deleteProgramFile(ProgramFile programFile) {
        programFile = null;
    }

}
