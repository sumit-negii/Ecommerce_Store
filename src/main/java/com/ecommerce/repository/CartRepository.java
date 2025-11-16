package com.ecommerce.repository;

import com.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	public Cart findByProductIdAndUserId(Long productId, Long userId);
	//public Cart findByProductAndUser(Product product, User user);

	public Long countByUserId(Long userId);

	public List<Cart> findByUserId(Long userId);
}
