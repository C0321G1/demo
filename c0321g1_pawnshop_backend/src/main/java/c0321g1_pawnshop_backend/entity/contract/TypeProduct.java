package c0321g1_pawnshop_backend.entity.contract;

import c0321g1_pawnshop_backend.entity.pawn_registration.PawnRegistration;
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
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeProductId;
    private String name;

    @OneToMany(mappedBy = "typeProduct", cascade = CascadeType.ALL)
<<<<<<< HEAD
    @JsonBackReference(value = "type-product")
    List<Contract> contracts;

    @OneToMany(mappedBy = "typeProduct", cascade = CascadeType.ALL)
    @JsonBackReference(value = "registration")
=======
    @JsonBackReference (value = "typeProduct-contract")
    List<Contract> contracts;

    @OneToMany(mappedBy = "typeProduct", cascade = CascadeType.ALL)
    @JsonBackReference (value = "typeProduct-pawnRegistration")
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    List<PawnRegistration> pawnRegistrations;
}
