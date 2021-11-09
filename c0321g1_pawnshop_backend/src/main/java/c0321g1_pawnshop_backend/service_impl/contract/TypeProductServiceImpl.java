package c0321g1_pawnshop_backend.service_impl.contract;

import c0321g1_pawnshop_backend.entity.contract.TypeProduct;
import c0321g1_pawnshop_backend.repository.contract.TypeProductRepository;
import c0321g1_pawnshop_backend.service.contract.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProductServiceImpl implements TypeProductService {
    @Autowired
    private TypeProductRepository typeProductRepository;

<<<<<<< HEAD
    /*long*/
    @Override
    public List<TypeProduct> findAll() {
        return typeProductRepository.findAll();
    }

    //Linh code
=======
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
    @Override
    public List<TypeProduct> getTypeProductList() {
        return typeProductRepository.getTypeProductList();
    }
}
