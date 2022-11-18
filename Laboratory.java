package shiyan4;

public class Laboratory {
    private int LaboratoryNumber;
    private String LaboratoryName;
    private String[] CleanlinessScore;

    public Laboratory(int LaboratoryNumber, String LaboratoryName, String[] CleanlinessScore) {
        this.LaboratoryNumber = LaboratoryNumber;
        this.LaboratoryName = LaboratoryName;
        this.CleanlinessScore = CleanlinessScore;
    }

    public int getLaboratoryNumber() {
        return LaboratoryNumber;
    }

    public String getLaboratoryName() {
        return LaboratoryName;
    }

    public String[] getCleanlinessScore() {
        return CleanlinessScore;
    }

    public int setLaboratoryNumber(int LaboratoryNumber) {
        this.LaboratoryNumber = LaboratoryNumber;
        return LaboratoryNumber;
    }

    public String setLaboratoryName(String LaboratoryName) {
        this.LaboratoryName = LaboratoryName;
        return LaboratoryName;
    }

    public String[] setCleanlinessScore(String[] CleanlinessScore) {
        this.CleanlinessScore = CleanlinessScore;
        return CleanlinessScore;
    }
}
