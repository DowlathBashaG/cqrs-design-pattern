package dowlath.io.controller;

import dowlath.io.dto.ProductEvent;
import dowlath.io.entity.Product;
import dowlath.io.service.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    @Autowired
    private ProductCommandService commandService;

    @PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent) {
        return commandService.createProduct(productEvent);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody ProductEvent productEvent) {
        return commandService.updateProduct(id, productEvent);
    }
}
