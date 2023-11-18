package opgaver.opg23;

public class Course {
    String name;
    Student[] participants;

    public Course(String name, Student[] participants) {
        this.name = name;
        this.participants = participants;
    }

    public Course() {}
    public void enrollStudent(Student student) {
        Student[] newParticipants = new Student[this.participants.length + 1];
        for (int i = 0; i < this.participants.length; i++) {
            newParticipants[i] = this.participants[i];
        }
        newParticipants[this.participants.length] = student;
        this.participants = newParticipants;

        System.out.println("Enrolled student " + student.getName() + " in course " + this.name);
    }

    public void getParticipants() {
        for (Student participant : this.participants) {
            if (participant != null) {
                System.out.println(participant.getName());
            }
        }
    }

    public void removeStudent(Student student) {
        Student[] newParticipants = new Student[this.participants.length - 1];
        int _student = 0;
        for (Student participant : this.participants) {
            if (participant != student) {
                newParticipants[_student] = participant;
                _student++;
            }
        }
        this.participants = newParticipants;
        System.out.println("Removed student " + student.getName() + " from course " + this.name);
    }
}
