package cgwac.encapsulation;

public class Semester {

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getStartOfTerm() {
        return startOfTerm;
    }

    public void setStartOfTerm(String startOfTerm) {
        this.startOfTerm = startOfTerm;
    }

    public String getEndOfTerm() {
        return endOfTerm;
    }

    public void setEndOfTerm(String endOfTerm) {
        this.endOfTerm = endOfTerm;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
    private String yearLevel;
    private String startOfTerm;
    private String endOfTerm;
    private String term;

    public Semester(String yearLevel, String term, String startOfTerm, String endOfTerm) {
        this.yearLevel = yearLevel;
        this.startOfTerm = startOfTerm;
        this.endOfTerm = endOfTerm;
        this.term = term;
    }

   
}
