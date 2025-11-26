package com.ecommerce.repository;

import com.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	Cart findByProductIdAndUserId(Long productId, Long userId);

	Long countByUserId(Long userId);

	List<Cart> findByUserId(Long userId);
}
