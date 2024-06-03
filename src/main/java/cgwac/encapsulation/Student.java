package cgwac.encapsulation;

public class Student {

    private String studentFirstName;
    private String studentLastName;
    private String birthDate;
    private String age;
    private String sex;
    private String studentNumber;
    private String yearLevel;
    private String college;
    private String major;
    private String organization;
    private String sports;
    private String studentID;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentID) {
        this.studentNumber = studentID;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public Student(String studentFirstName, String studentLastName, String birthDate, String age, String sex, String studentNumber, String yearLevel, String college, String major, String organization, String sports, String studentID) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.birthDate = birthDate;
        this.age = age;
        this.sex = sex;
        this.studentNumber = studentNumber;
        this.yearLevel = yearLevel;
        this.college = college;
        this.major = major;
        this.organization = organization;
        this.sports = sports;
        this.studentID = studentID;
    }
}
