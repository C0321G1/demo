package c0321g1_pawnshop_backend.service_impl.security;

<<<<<<< HEAD
import c0321g1_pawnshop_backend.entity.security.Role;
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
import c0321g1_pawnshop_backend.repository.security.RoleRepository;
import c0321g1_pawnshop_backend.service.security.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
<<<<<<< HEAD

    @Override
    public void saveRole(Role role) {

    }
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
}
