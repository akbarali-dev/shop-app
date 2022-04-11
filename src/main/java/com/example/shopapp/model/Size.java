package com.example.shopapp.model;


import com.example.shopapp.model.template.NameAbsEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Size extends NameAbsEntity {
    @NotNull
    private int value;

    @OneToMany(mappedBy = "size", cascade = CascadeType.ALL)
    private List<Cloth> cloths;

    @ManyToMany
    private List<Age> ages;

    public Size(int value) {
        this.value = value;
    }
}
