package c0321g1_pawnshop_backend.service_impl.customer;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.customer.Gender;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import c0321g1_pawnshop_backend.repository.customer.GenderRepository;
import c0321g1_pawnshop_backend.service.customer.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
@Service
public class GenderServiceImpl implements GenderService {
    @Autowired
    private GenderRepository genderRepository;
<<<<<<< HEAD

    @Override
    public List<Gender> getGenderList() {
        return genderRepository.findAll();
    }

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
