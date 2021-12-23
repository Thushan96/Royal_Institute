package lk.ijse.pos.hibernate.entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class Student implements SuperEntity {
    @Id
    private String s_id;
    private String s_name;
    private String address;
    private int contact_no;
    private String gender;

    @OneToMany(mappedBy = "Student" ,cascade = CascadeType.ALL)
    private List<Registration> registrations=new ArrayList<>();

    public Student() {
    }

    public Student(String s_id) {
        this.setS_id(s_id);
    }

    public Student(String s_id, String s_name, String address, int contact_no, String gender) {
        this.setS_id(s_id);
        this.setS_name(s_name);
        this.setAddress(address);
        this.setContact_no(contact_no);
        this.setGender(gender);
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getContact_no() == student.getContact_no() &&
                Objects.equals(getS_id(), student.getS_id()) &&
                Objects.equals(getS_name(), student.getS_name()) &&
                Objects.equals(getAddress(), student.getAddress()) &&
                Objects.equals(getGender(), student.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getS_id(), getS_name(), getAddress(), getContact_no(), getGender());
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", address='" + address + '\'' +
                ", contact_no=" + contact_no +
                ", gender='" + gender + '\'' +
                '}';
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
