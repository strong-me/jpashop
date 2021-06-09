package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
public class Delivery {

	@Id @GeneratedValue
	@Column(name = "DELIVERY_ID")
	private Long id;

	@OneToOne(mappedBy = "delivery")
	private Order order;
	private String city;
	private String street;
	private String zipcode;
	private DeliveryStatus status;
}
