package c0321g1_pawnshop_backend.service_impl.contract;

import c0321g1_pawnshop_backend.entity.contract.StatusContract;
import c0321g1_pawnshop_backend.repository.contract.StatusContractRepository;
import c0321g1_pawnshop_backend.service.contract.StatusContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusContractServiceImpl implements StatusContractService {
    @Autowired
    private StatusContractRepository statusContractRepository;
<<<<<<< HEAD

    /*long*/
    @Override
    public List<StatusContract> findAll() {
        return statusContractRepository.findAll();
    }

=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    //Vu code
    @Override
    public List<StatusContract> getStatusContractList() {
        return this.statusContractRepository.getStatusContractList();
    }
}
