package com.x5.goodslist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "goods", schema = "public")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal price;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "good_category",
            joinColumns = { @JoinColumn(name = "good_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
    private List<Category> categories;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "good_brand",
            joinColumns = { @JoinColumn(name = "good_id") },
            inverseJoinColumns = { @JoinColumn(name = "brand_id") }
    )
    private List<Brand> brands;




}
