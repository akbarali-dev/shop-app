package com.example.shopapp.model;


import com.example.shopapp.model.enums.Season;
import com.example.shopapp.model.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "cloths")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cloth extends AbsEntity {

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Type type;

    @ManyToOne
    private Size size;

    @OneToOne
    private Discount discount;

    @Enumerated(EnumType.STRING)
    private Season season;

    @ManyToMany
    @JoinTable(
            name = "country_of_origin_cloths",
            joinColumns = @JoinColumn(name = "cloth_id"),
            inverseJoinColumns = @JoinColumn(name = "country_of_origin_id"))
    private List<CountryOfOrigin> countryOfOrigins;

    @ManyToMany
    @JoinTable(
            name = "cloth_structures",
            joinColumns = @JoinColumn(name = "cloth_id"),
            inverseJoinColumns = @JoinColumn(name = "structure_id"))
    private List<Structure> structures;

    @ManyToMany
    @JoinTable(
            name = "clothes_colors",
            joinColumns = @JoinColumn(name = "cloth_id"),
            inverseJoinColumns = @JoinColumn(name = "clothing_id"))
    private List<Color> colors;

    @ManyToOne
    private Cart cart;

    @OneToMany(mappedBy = "cloth", cascade = CascadeType.ALL)
    private List<Attachment> attachments;

    private boolean forMean;

    private double forTradersPrice;

    private double forUserAdditionalPrice;


}
