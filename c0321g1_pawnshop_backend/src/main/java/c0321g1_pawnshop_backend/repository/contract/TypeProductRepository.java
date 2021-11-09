package c0321g1_pawnshop_backend.repository.contract;

import c0321g1_pawnshop_backend.entity.contract.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
<<<<<<< HEAD

import java.util.List;

public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
    /*long*/
    @Query(value = "select * from type_product;", nativeQuery = true)
    List<TypeProduct> findAll();

    //Linh code
    @Query(value = "select * from type_product", nativeQuery = true)
    List<TypeProduct> getTypeProductList();

}


=======
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct,Long> {
    @Query(value = "select * from type_product", nativeQuery = true)
    List<TypeProduct> getTypeProductList();
}
>>>>>>> b4282ffe7b00faa377054aa2730be124489f086d
