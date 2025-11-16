package com.ecommerce.service;

import com.ecommerce.entity.ProductOrder;
import com.ecommerce.entity.ProductOrderRequest;

public interface ProductOrderService {
	
	public ProductOrder saveProductOrder(Long id, ProductOrderRequest productOrderRequest);
}
