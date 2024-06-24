package org.springboot.controller;

import org.springboot.entity.Product;
import org.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String listProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product-list"; // Ensure you have product-list.html in your templates directory
    }

    @GetMapping("/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form"; // Ensure you have product-form.html in your templates directory
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/product/list"; // Redirect to the product list page
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        // Add error handling for product not found scenario if needed
        productService.delete(id);
        return "redirect:/product/list"; // Redirect to the product list page after deletion
    }
}
