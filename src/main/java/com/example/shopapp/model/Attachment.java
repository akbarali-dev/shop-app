package com.example.shopapp.model;


import com.example.shopapp.model.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attachment extends AbsEntity {
    private String fileName;

    private String contentType;

    private long size;

    private boolean isMainPicture;

    @ManyToOne
    private Cloth cloth;
}
