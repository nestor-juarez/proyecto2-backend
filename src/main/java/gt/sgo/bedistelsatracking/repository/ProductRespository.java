package gt.sgo.bedistelsatracking.repository;

import gt.sgo.bedistelsatracking.model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ProductRespository extends CrudRepository<Product, Integer> {
    @Override
    Iterable<Product> findAll();

    @Transactional
    @Modifying
    @Query("update Product p set p.nombre = ?1, p.descripcion = ?2 where p.idProducto= ?3")
    void setProductInfoById(String name, String desc, Long productId);
}
