package c0321g1_pawnshop_backend.entity.customer;

import c0321g1_pawnshop_backend.entity.contract.Contract;
import c0321g1_pawnshop_backend.entity.employee.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genderId;
    private String name;

    @OneToMany(mappedBy = "gender", cascade = CascadeType.ALL)
<<<<<<< HEAD
    @JsonBackReference(value = "gender-customer")
    List<Customer> customers;

    @OneToMany(mappedBy = "gender",cascade = CascadeType.ALL)
    @JsonBackReference(value = "gender-employee")
=======
    @JsonBackReference
    List<Customer> customers;

    @OneToMany(mappedBy = "gender",cascade = CascadeType.ALL)
    @JsonBackReference
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    private Set<Employee> employeeSet;
}
