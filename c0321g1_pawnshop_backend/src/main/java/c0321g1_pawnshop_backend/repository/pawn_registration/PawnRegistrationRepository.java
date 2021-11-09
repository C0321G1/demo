package c0321g1_pawnshop_backend.repository.pawn_registration;

import c0321g1_pawnshop_backend.entity.pawn_registration.PawnRegistration;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface PawnRegistrationRepository extends JpaRepository<PawnRegistration,Long> {
    Page<PawnRegistration> findAll(Pageable pageable);
}
=======
import org.springframework.data.jpa.repository.JpaRepository;

public interface PawnRegistrationRepository extends JpaRepository<PawnRegistration,Long> {
}
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
