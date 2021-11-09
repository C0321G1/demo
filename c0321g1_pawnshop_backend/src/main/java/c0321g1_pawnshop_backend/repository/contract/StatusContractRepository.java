package c0321g1_pawnshop_backend.repository.contract;

import c0321g1_pawnshop_backend.entity.contract.StatusContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

<<<<<<< HEAD
public interface StatusContractRepository extends JpaRepository<StatusContract, Long> {
    /*long*/
    @Query(value = "select * from status_contract;", nativeQuery = true)
    List<StatusContract> findAll();

=======
public interface StatusContractRepository extends JpaRepository<StatusContract,Long> {
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    //Vu code
    @Query(value = "select * from status_contract", nativeQuery = true)
    List<StatusContract> getStatusContractList();
}
