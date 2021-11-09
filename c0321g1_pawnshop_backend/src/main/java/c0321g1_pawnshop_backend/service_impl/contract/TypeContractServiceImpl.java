package c0321g1_pawnshop_backend.service_impl.contract;

import c0321g1_pawnshop_backend.entity.contract.TypeContract;
import c0321g1_pawnshop_backend.repository.contract.TypeContractRepository;
import c0321g1_pawnshop_backend.service.contract.TypeContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeContractServiceImpl implements TypeContractService {
    @Autowired
    private TypeContractRepository typeContractRepository;
<<<<<<< HEAD

    /*long*/
    @Override
    public List<TypeContract> findAll() {
        return typeContractRepository.findAll();
    }

    //Vu code
=======
     //Vu code
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    @Override
    public List<TypeContract> getTypeContractList() {
        return this.typeContractRepository.getTypeContractList();
    }
}
