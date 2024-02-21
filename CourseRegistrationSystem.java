package codesoft;
import java.util.ArrayList;
import java.util.List;

class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private List<String> schedule;
    private int enrolledStudents;

    public Course(String code, String title, String description, int capacity, List<String> schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = 0;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent() {
        enrolledStudents++;
    }

    public void removeStudent() {
        enrolledStudents--;
    }

    public boolean hasSpace() {
        return enrolledStudents < capacity;
    }
}

class Student {
    private String id;
    private String name;
    private List<Course> registeredCourses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        course.enrollStudent();
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
        course.removeStudent();
    }
}

public class CourseRegistrationSystem {
    private List<Course> courses;
    private List<Student> students;

    public CourseRegistrationSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.getCode());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Description: " + course.getDescription());
            System.out.println("Capacity: " + course.getCapacity());
            System.out.println("Enrolled Students: " + course.getEnrolledStudents());
            System.out.println("Schedule: " + course.getSchedule());
            System.out.println("------------------------");
        }
    }

    public void registerStudent(Student student, Course course) {
        if (course.hasSpace()) {
            student.registerCourse(course);
            System.out.println("Student " + student.getName() + " registered for course " + course.getTitle());
        } else {
            System.out.println("Course " + course.getTitle() + " is full.");
        }
    }

    public void dropStudent(Student student, Course course) {
        if (student.getRegisteredCourses().contains(course)) {
            student.dropCourse(course);
            System.out.println("Student " + student.getName() + " dropped from course " + course.getTitle());
        } else {
            System.out.println("Student " + student.getName() + " is not registered for course " + course.getTitle());
        }
    }

    public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();
        Course course1 = new Course("JAVA07", "Introduction to Java Programming", "Complete Core Java", 20, List.of("Monday, Wednesday, Friday 8:00-11:00"));
        Course course2 = new Course("PYTHON08", "Introduction to Python Programming", "Complete python ", 15, List.of("Tuesday, Thursday, 11:30-2:00"));
        Course course3 = new Course("HTML&CSS", "Introduction to Web Technologies", "Complete html,css and javascript", 30, List.of("saturday, sunday, 10:30-1:00"));
        Course course4 = new Course("Sql", "Introduction to Database", "Complete sql ", 35, List.of("saturday,sunday,2:30-5:00"));
        system.addCourse(course1);
        system.addCourse(course2);
        system.addCourse(course3);
        system.addCourse(course4);

        Student std1 = new Student("01", "Akhila");
        Student std2 = new Student("02", "Sakala");
        Student std3 = new Student("03", "nikhitha");
        Student std4 = new Student("04", "murali");
        system.addStudent(std1);
        system.addStudent(std1);
        system.displayCourses();
        system.registerStudent(std1, course1);

        system.dropStudent(std1, course1);
}
}
