package com.skypro.javaind.demoshoppingcart.service;
import com.skypro.javaind.demoshoppingcart.model.Productt;
import com.skypro.javaind.demoshoppingcart.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service


public class ShoppingCartServiceImpl implements com.skypro.javaind.demoshoppingcart.service.ShoppingCartService {


    @Override
    public void addProduct(Set<Integer> productIds, ShoppingCart shoppingCart) {
        for (Integer productId : productIds) {
            shoppingCart.addProduct(new Productt(productId));
        }
    }


}