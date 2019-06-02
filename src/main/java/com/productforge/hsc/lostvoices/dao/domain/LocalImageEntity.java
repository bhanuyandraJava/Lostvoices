package com.productforge.hsc.lostvoices.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LOCAL_UPLOADED_IMAGES")
@Data
public class LocalImageEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "IMAGE_NAME")
    private String imageName;

    @Column(name = "BLOB")
    private byte[] blob;
}
