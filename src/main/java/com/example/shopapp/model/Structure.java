package com.example.shopapp.model;


import com.example.shopapp.model.template.AbsEntity;
import com.example.shopapp.model.template.NameAbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Structure extends NameAbsEntity {
private double percent;

}
