package c0321g1_pawnshop_backend.dto.employee;

import c0321g1_pawnshop_backend.dto.customer.GenderDto;
import c0321g1_pawnshop_backend.dto.security.AccountDto;
<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.customer.Gender;
import c0321g1_pawnshop_backend.entity.security.Account;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

<<<<<<< HEAD
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long employeeId;
<<<<<<< HEAD
    @NotEmpty
    @Min(1)
    @NotNull
    private String salary;
    @NotEmpty
    @NotNull
    private String idCard;
    @NotEmpty
    private String name;
    @NotEmpty
    private String employeeCode;
    @NotEmpty
    private String birthDate;
    @NotEmpty
    private String address;
    @NotEmpty
    @Email
    private String email;
    private String image;
    @NotEmpty
    private String phone;
    private Long flag;
    private AccountDto accountDto;
    private GenderDto genderDto;
=======
    private String salary;
    private String idCard;
    private String name;
    private String employeeCode;
    private String birthDate;
    private String address;
    private String email;
    private String image;
    private String phone;
    private int flag;
    private AccountDto account;
    private GenderDto gender;
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
