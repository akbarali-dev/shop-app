package com.example.shopapp.model;


import com.example.shopapp.model.template.NameAbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity

@Data
public class CountryOfOrigin extends NameAbsEntity {

}
