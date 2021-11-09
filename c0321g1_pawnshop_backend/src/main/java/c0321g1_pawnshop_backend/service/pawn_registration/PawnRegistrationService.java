package c0321g1_pawnshop_backend.service.pawn_registration;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.pawn_registration.PawnRegistration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PawnRegistrationService {
    Page<PawnRegistration> findAll(Pageable pageable);

    void save(PawnRegistration pawnRegistration);

    PawnRegistration findById(Long id);
}
=======
public interface PawnRegistrationService {
}
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
