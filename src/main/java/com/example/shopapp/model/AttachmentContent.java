package com.example.shopapp.model;


import com.example.shopapp.model.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AttachmentContent extends AbsEntity {
    private byte[] data;

    @OneToOne
    private Attachment attachment;
}
