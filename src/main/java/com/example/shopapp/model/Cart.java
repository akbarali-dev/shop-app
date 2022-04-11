package com.example.shopapp.model;


import com.example.shopapp.model.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart extends AbsEntity {
    private boolean purchased;
    private int quantity;

    @ManyToOne
    private User user;

    @ManyToOne
    private Cloth cloth;
}
