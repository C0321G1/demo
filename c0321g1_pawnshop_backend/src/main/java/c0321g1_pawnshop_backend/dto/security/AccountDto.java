package c0321g1_pawnshop_backend.dto.security;

<<<<<<< HEAD
=======
import c0321g1_pawnshop_backend.dto.employee.EmployeeDto;
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long accountId;
    private String password;
    private String username;
    private String userTime;
<<<<<<< HEAD
    private int status;
=======
    private EmployeeDto employee;
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
