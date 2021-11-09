package c0321g1_pawnshop_backend.entity.security;

import c0321g1_pawnshop_backend.entity.employee.Employee;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.HashSet;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String password;
    private String username;
    private String userTime;
<<<<<<< HEAD
    private int status;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "account_role",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roleSet = new HashSet<>();

    @OneToOne(mappedBy = "account")
    @JsonBackReference
=======
    @ManyToMany(targetEntity = Role.class)
    @JoinTable(name = "account_role",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roleSet;
    @JsonIgnore
    @OneToOne(mappedBy = "account")
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    private Employee employee;
}
