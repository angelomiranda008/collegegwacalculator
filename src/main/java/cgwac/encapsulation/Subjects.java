package cgwac.encapsulation;

public class Subjects {

    private String course;
    private String acronym;
    private String units;
    private String instructor;
    private String attendance;
    private String quiz;
    private String assignment;
    private String exam;
    private String others;

    public Subjects(String course, String acronym, String units, String instructor, String attendance, String quiz, String assignment, String exam, String others) {
        this.course = course;
        this.acronym = acronym;
        this.units = units;
        this.instructor = instructor;
        this.attendance = attendance;
        this.quiz = quiz;
        this.assignment = assignment;
        this.exam = exam;
        this.others = others;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public int calculateTotal() {
        int total = 0;
        try {
            total += Integer.parseInt(attendance);
            total += Integer.parseInt(quiz);
            total += Integer.parseInt(assignment);
            total += Integer.parseInt(exam);
            total += Integer.parseInt(others);
        } catch (NumberFormatException e) {
            // Handle exception if needed
        }
        return total;
    }
}
