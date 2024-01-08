public class Student {
    private Long registrationNumber;
    private String name;
    private Integer age;
    public Student(Long registrationNumber, String name) {
        this.name = name;
    }
    public Long getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String nome) {
        this.name = nome;
    }
}
