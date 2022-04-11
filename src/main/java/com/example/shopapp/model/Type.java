package com.example.shopapp.model;


import com.example.shopapp.model.template.NameAbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Type extends NameAbsEntity {
    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Cloth> cloths;

}
