package c0321g1_pawnshop_backend.repository.security;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.security.Account;
import c0321g1_pawnshop_backend.entity.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT into account_role (account_id,role_id) values (?1,1);", nativeQuery = true)
    void saveRole(Long accountId);

=======
import c0321g1_pawnshop_backend.entity.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
