package opgaver.opg23;

public class EnrollmentSystem {

    Student[] students;
    Course[] courses;

    public void getStudents() {
        this.students.clone();
    }

    public void getCourses() {
        this.courses.clone();
    }

    public void enrollStudent(Student student, Course course) {
        course.enrollStudent(student);
    }

    public void removeStudent(Student student, Course course) {
        course.removeStudent(student);
    }

    public void showParticipants(Course course) {
        course.getParticipants();
    }

    public void addStudent(Student student) {
        Student[] newStudent = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            newStudent[i] = this.students[i];
        }
        newStudent[this.students.length] = student;
        this.students = newStudent;
    }

    public void removeStudent(Student student) {
        Student[] newStudent = new Student[this.students.length - 1];
        int _student = 0;
        for (Student participant : this.students) {
            if (participant != student) {
                newStudent[_student] = participant;
                _student++;
            }
        }
        this.students = newStudent;
    }

    public void addCourse(Course course) {
        Course[] newCourse = new Course[this.courses.length + 1];
        for (int i = 0; i < this.courses.length; i++) {
            newCourse[i] = this.courses[i];
        }
        newCourse[this.courses.length] = course;
        this.courses = newCourse;
    }

    public void removeCourse(Course course) {
        Course[] newCourse = new Course[this.courses.length - 1];
        int _course = 0;
        for (Course participant : this.courses) {
            if (participant != course) {
                newCourse[_course] = participant;
                _course++;
            }
        }
        this.courses = newCourse;
    }
}
