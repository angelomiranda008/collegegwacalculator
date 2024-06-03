package cgwac.encapsulation;

import java.util.ArrayList;

public class Colleges {
    private final String college;

    public Colleges(String college) {
        this.college = college;
    }

    public ArrayList<String> setPrograms() {
        return getPrograms(college);
    }

    public ArrayList<String> getPrograms(String college) {
        ArrayList<String> programs = new ArrayList<>();

        switch (college) {
            case "College of Arts and Social Sciences" -> {
                programs.add("Bachelor of Arts in Communication");
                programs.add("Bachelor of Arts in English Language Studies");
                programs.add("Bachelor of Arts in Psychology");
                programs.add("Bachelor in Human Services");
            }
            case "College of Architecture and Fine Arts" -> {
                programs.add("Bachelor of Science in Architecture");
                programs.add("Bachelor of Fine Arts Major in Visual Communication");
            }
            case "College of Business and Accountancy" -> {
                programs.add("Bachelor of Science in Accountancy");
                programs.add("Bachelor of Science in Accounting Information System");
                programs.add("Bachelor of Science in Entrepreneurship");
                programs.add("Bachelor of Science in Hospitality Management");
                programs.add("Bachelor of Science in Business Administration Major in Business Economics");
                programs.add("Bachelor of Science in Business Administration Major in Financial Management");
                programs.add("Bachelor of Science in Business Administration Major in Marketing Management");
            }
            case "College of Computer Studies" -> {
                programs.add("Bachelor of Science in Information Technology specialized in Network Administration");
                programs.add("Bachelor of Science in Information Technology specialized in Web and Mobile Application");
                programs.add("Bachelor of Science in Information Technology specialized in Technical Service Management");
                programs.add("Bachelor of Science in Information Systems specialized in Business Analytics");
                programs.add("Bachelor of Science in Computer Science");
            }
            case "College of Engineering" -> {
                programs.add("Bachelor of Science in Civil Engineering");
                programs.add("Bachelor of Science in Electrical Engineering");
                programs.add("Bachelor of Science in Electronics Engineering");
                programs.add("Bachelor of Science in Industrial Engineering");
                programs.add("Bachelor of Science in Mechanical Engineering");
            }
            case "College of Industrial Technology" -> {
                programs.add("Bachelor of Industrial Technology major in Automotive Technology");
                programs.add("Bachelor of Industrial Technology major in Electrical Technology");
                programs.add("Bachelor of Industrial Technology major in Mechatronics Technology");
            }
            case "College of Criminal Justice Education" -> programs.add("Bachelor of Science in Criminology");
            case "College of Public Administration and Governance" -> programs.add("Bachelor of Public Administration");
            case "College of Education" -> {
                programs.add("Bachelor of Elementary Education (General Education)");
                programs.add("Bachelor of Secondary Education major in English");
                programs.add("Bachelor of Secondary Education major in Filipino");
                programs.add("Bachelor of Secondary Education major in Mathematics");
                programs.add("Bachelor of Secondary Education major in Social Studies");
                programs.add("Bachelor of Secondary Education major in Sciences");
                programs.add("Bachelor of Early Childhood Education");
                programs.add("Bachelor of Technology and Livelihood Education major in Industrial Arts");
                programs.add("Bachelor of Technical - Vocational Teacher Education major in Food Service Management");
                programs.add("Bachelor of Physical Education");
            }
            case "College of Science" -> {
                programs.add("Bachelor of Science in Chemistry");
                programs.add("Bachelor of Science in Nursing");
                programs.add("Bachelor of Science in Environmental Science");
                programs.add("Bachelor of Science in Mathematics");
                programs.add("Bachelor of Science in Food Technology");
            }
            case "School of Law" -> {
                programs.add("Juris Doctor");
                programs.add("Master of Laws");
            }
            default -> programs.add("College not found");
        }

        return programs;
    }
}
