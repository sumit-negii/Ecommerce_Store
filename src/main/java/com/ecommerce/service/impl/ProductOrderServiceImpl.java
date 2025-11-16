package com.ecommerce.service.impl;

import com.ecommerce.entity.Cart;
import com.ecommerce.entity.ProductOrder;
import com.ecommerce.entity.ProductOrderRequest;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.repository.ProductOrderRepository;
import com.ecommerce.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

	@Autowired
	private ProductOrderRepository productOrderRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public ProductOrder saveProductOrder(Long userId, ProductOrderRequest productOrderRequest) {
		
		//get which products are order by user
		List<Cart> listOfCarts = cartRepository.findByUserId(userId);
		for (Cart cart : listOfCarts) {
			
			ProductOrder order = new ProductOrder();
			
			order.setOrderId(UUID.randomUUID().toString());
			order.setOrderDate(new Date());
			
			order.setProduct(cart.getProduct());
			order.setPrice(cart.getProduct().getDiscountPrice());
			order.setQuantity(cart.getQuantity());
			
			order.setUser(cart.getUser());
			order.setStatus("In Progress");
			
			
			
		}
		
		return null;
	}

}
