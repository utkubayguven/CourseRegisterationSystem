import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private Semester semester;
    private Advisor advisor;
    private Transcript transcript;
    private ArrayList<Course> selectedCourses;
    private CourseSession selectedSessions;
    private int entryYear;
    private Schedule schedule;
    private float gpa;
    private float cgpa;
    private int completedCredit;
    private List<Course> activeCourses;
    private List<Course> pastCourses;
    private List<Course> nonTakenCourses;
    private List<Course> failedCourses;
    private Map<Course, Grade> hashMapGrade = new HashMap<>();

    public Student(String studentID, Semester semester, Advisor advisor, Transcript transcript, ArrayList<Course> selectedCourses,
                   CourseSession selectedSessions, int entryYear, Schedule schedule, float gpa, float cgpa, int completedCredit,
                   List<Course> activeCourses, List<Course> pastCourses, List<Course> nonTakenCourses, List<Course> failedCourses,
                   Map<Course, Grade> hashMapGrade) {
        this.studentID = studentID;
        this.semester = semester;
        this.advisor = advisor;
        this.transcript = transcript;
        this.selectedCourses = selectedCourses;
        this.selectedSessions = selectedSessions;
        this.entryYear = entryYear;
        this.schedule = schedule;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.completedCredit = completedCredit;
        this.activeCourses = activeCourses;
        this.pastCourses = pastCourses;
        this.nonTakenCourses = nonTakenCourses;
        this.failedCourses = failedCourses;
        this.hashMapGrade = hashMapGrade;
    }

    public Map<Course, Grade> getHashMapGrade() {
        return hashMapGrade;
    }

    public void setHashMapGrade(Map<Course, Grade> hashMapGrade) {
        this.hashMapGrade = hashMapGrade;
    }

    // getter and setter methods
    public String getStudentID() {return this.studentID;}
    public void setStudentID(String studentID) {this.studentID = studentID;}

    public Semester getSemester() {return this.semester;}

    public void setSemester(Semester semester) {this.semester = semester;}

    public Advisor getAdvisor() {return this.advisor;}

    public void setAdvisor(Advisor advisor) {this.advisor = advisor;}

    public Transcript getTranscript() {return this.transcript;}

    public void setTranscript(Transcript transcript) {this.transcript = transcript;}

    public ArrayList<Course> getSelectedCourses() {return this.selectedCourses;}

    public void setSelectedCourses(ArrayList<Course> selectedCourses) {this.selectedCourses = selectedCourses;}

    public CourseSession getSelectedSessions() {return this.selectedSessions;}

    public void setSelectedSessions(CourseSession selectedSessions) {this.selectedSessions = selectedSessions;}

    public int getEntryYear() {return this.entryYear;}

    public void setEntryYear(int entryYear) {this.entryYear = entryYear;}

    public Schedule getSchedule() {return this.schedule;}

    public void setSchedule(Schedule schedule) {this.schedule = schedule;}

    public float getGpa() {return gpa;}

    public void setGpa(float gpa) {this.gpa = gpa;}

    public float getCgpa() {return cgpa;}

    public void setCgpa(float cgpa) {this.cgpa = cgpa;}

    public int getCompletedCredit() {return completedCredit;}

    public void setCompletedCredit(int completedCredit) {this.completedCredit = completedCredit;}

    public List<Course> getActiveCourses() {return activeCourses;}

    public void setActiveCourses(List<Course> activeCourses) {this.activeCourses = activeCourses;}

    public List<Course> getPastCourses() {return pastCourses;}

    public void setPastCourses(List<Course> pastCourses) {this.pastCourses = pastCourses;}

    public List<Course> getNonTakenCourses() {return nonTakenCourses;}

    public void setNonTakenCourses(List<Course> nonTakenCourses) {this.nonTakenCourses = nonTakenCourses;}

    public List<Course> getFailedCourses() {return failedCourses;}

    public void setFailedCourses(List<Course> failedCourses) {this.failedCourses = failedCourses;}

    public void calculateGpa(){
        int credit = transcript.getCredit();
        int grade = transcript.getGrade();
        int result = grade/credit;
        setGpa((float) result);
    }

    public void calculateCumulativeGpa(){
        int cCredit = transcript.getCumulativeCredit();
        int cGrade = transcript.getCumulativeGrade();
        int result = cGrade/cCredit;
        setCgpa((float) result);
    }

    public void printActiveCourses(){
        int i = 0;
        System.out.println(getName()+' '+getSurname());
        while (i < activeCourses.size()) {
            Course course = activeCourses.get(i);
            System.out.println(course.getName());
            i++;
        }
    }

    /*
    @Override// must be revised after controller part
    public boolean login(String studentID, String password) {
        // check if the provided email and password match the ones
        // stored in this Student object
        if (email.equals(this.getEmail()) && password.equals(this.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public Course enrollCourse(Arraylist<String> selectedCourseIDs, Arraylist<Course> coursesfForSemester){
        boolean status;
        Arraylist<Course> avaliableSelectedCourses;

        for(String s: selectedCourseIDs){
            for(int i = 0; i++; i<coursesfForSemester.size){
                if(s.equalsIgnoreCase(coursesfForSemester.get(i).getCourseCode().courseID)){
                    status = true;
                    avaliableSelectedCourses.add(coursesfForSemester.get(i));
                }
                else{
                    status = false;
                }
            }
        }
        if(status == true){
            setSelectedCourses(avaliableSelectedCourses);

        }
        else{
            System.out.println("Entered Wrong Course ID...");
        }
        return avaliableSelectedCourses;
    }

    public  sendToApproval(Schedule schedule, Arraylist<Course> courses){
        //checkPrequisite();
        //checkTotalCredits();
    }*/


}