package h2tml.qlns.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    private String  salary_name;

   private  Integer id_staffs;

    private  Integer id_departs;

    private Integer  id_position;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSalary_name() {
        return salary_name;
    }

    public void setSalary_name(String salary_name) {
        this.salary_name = salary_name;
    }

    public Integer getId_staffs() {
        return id_staffs;
    }

    public void setId_staffs(Integer id_staffs) {
        this.id_staffs = id_staffs;
    }

    public Integer getId_departs() {
        return id_departs;
    }

    public void setId_departs(Integer id_departs) {
        this.id_departs = id_departs;
    }

    public Integer getId_position() {
        return id_position;
    }

    public void setId_position(Integer id_position) {
        this.id_position = id_position;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", salary_name='" + salary_name + '\'' +
                ", id_staffs=" + id_staffs +
                ", id_departs=" + id_departs +
                ", id_position=" + id_position +
                '}';
    }
}
