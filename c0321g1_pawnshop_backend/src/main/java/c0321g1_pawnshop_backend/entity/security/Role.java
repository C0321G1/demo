package c0321g1_pawnshop_backend.entity.security;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
<<<<<<< HEAD
    @Enumerated(EnumType.STRING)
    private ERole name;
    @ManyToMany(mappedBy ="roleSet" )
    @JsonBackReference
=======
    private String name;
    @ManyToMany(mappedBy ="roleSet" )
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    private Set<Account> accountSet;
}
