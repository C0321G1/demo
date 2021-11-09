package c0321g1_pawnshop_backend.entity.customer;

import c0321g1_pawnshop_backend.entity.contract.Contract;
import c0321g1_pawnshop_backend.entity.contract.TypeContract;
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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerCode;
    private String name;
    private String idCard;
<<<<<<< HEAD
    @Column(columnDefinition = "int default 1")
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    private int flag;
    private String phone;
    private String image;
    private String email;
    private String address;
    private String birthDate;

    @ManyToOne
    @JoinColumn(name = "genderId",referencedColumnName = "genderId")
    private Gender gender;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
<<<<<<< HEAD
    @JsonIgnore
=======
    @JsonBackReference
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    List<Contract> contracts;

}
