package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private com.ecommerce.entity.Product product;
	
	private Integer quantity;
	
	@Transient
	private Double totalPrice; //Transient :this column will not created in DB. just use for UI purpose.
	
	@Transient
	private Double totalOrderPrice; //Transient :this column will not created in DB. just use for UI purpose.
	
}
