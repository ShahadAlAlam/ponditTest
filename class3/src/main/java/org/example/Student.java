package org.example;

public class Student {
    private Long id;
    private String studentId;
    private String Name;
    private Long deptId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Student(Long id, String studentId, String name, Long deptId) {
        this.id = id;
        this.studentId = studentId;
        Name = name;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", Name='" + Name + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
