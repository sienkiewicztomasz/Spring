package com.allegro.trade.controllers;

import com.allegro.trade.domain.Product;
import com.allegro.trade.services.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private ProductService productService;

    Logger logger = Logger.getRootLogger();

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAllProducts());
        return "products";
    }

    @PostMapping("/products/find")
    public String listProductsByDescription(Model model, @RequestParam String description) {
        //String like = "%"+description+"%";
        model.addAttribute("products",
                productService.listAllProductsWithDescription(description));
        return "products";
    }

    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

    @RequestMapping("/product/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "productForm";
    }

    @RequestMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }

    @RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String newOrUpdateProduct(Product product){
        Product savedProduct = productService.saveOrUpdateProduct(product);
        return "redirect:/product/" + savedProduct.getId();
    }
}
