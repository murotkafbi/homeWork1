package com.skypro.javaind.demoshoppingcart.model;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;
@SessionScope
public class ShoppingCart {
    private final Set<Productt> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashSet<>();
    }
    public void addProduct(Productt product){
        shoppingCart.add(product);
        for (Productt product1 : shoppingCart) {
            System.out.print(product1.getProductId());

        }
    }

    public Set<Productt> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }
}