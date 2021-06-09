package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Item {

	@Id @GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;
	private String name;
	private Integer price;
	private Integer stockQuantity;

	@ManyToMany(mappedBy = "itemList")
	private List<Category> categoryList = new ArrayList<>();
}
