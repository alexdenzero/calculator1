package com.heimtn.skyprospringhw.hwspring.services;

import com.heimtn.skyprospringhw.hwspring.repositories.ShoppingBasket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    private ShoppingBasket shoppingBasket = new ShoppingBasket();


    @Override
    public List<Integer> getItemsFromShBasket(){
        return shoppingBasket.getShoppingBasket();
    }

    @Override
    public void addItemToShBasket(List<Integer> numbers){
        for (Integer number : numbers) {
            shoppingBasket.addShoppingBasket(number);
        }
    }
}
