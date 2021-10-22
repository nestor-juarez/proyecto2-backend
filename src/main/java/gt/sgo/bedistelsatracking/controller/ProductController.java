package gt.sgo.bedistelsatracking.controller;

import gt.sgo.bedistelsatracking.model.Product;
import gt.sgo.bedistelsatracking.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRespository productRespository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts(){
        Iterable<Product> dataList = productRespository.findAll();
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        productRespository.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        productRespository.setProductInfoById(product.getNombre(), product.getDescripcion(), product.getIdProducto());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteProduct(@RequestBody Product product){
        productRespository.delete(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
