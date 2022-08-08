package com.geekbrains.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private ProductService productService;

    @Autowired
    public MainController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/addProduct")
    public String openProductAddPage(){
        return "productAddPage";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam Long id, @RequestParam String name, @RequestParam int cost){
        Product product = new Product(id, name, cost);
        productService.saveProduct(product);
        return "productAddPage";
    }

    @GetMapping ("/allProducts")
    public String allProducts(Model model){
        model.addAttribute("products", productService.findAll());
        return "allProducts";
    }

}
