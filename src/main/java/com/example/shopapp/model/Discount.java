package com.example.shopapp.model;


import com.example.shopapp.model.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Discount extends AbsEntity {
    private double discountAmount;
    private LocalDate startDate;
    private LocalDate endDate;
}
