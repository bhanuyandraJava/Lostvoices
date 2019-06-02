package com.productforge.hsc.lostvoices.pojos;

import lombok.Data;

import java.io.Serializable;

@Data
public class LocalImage implements Serializable {
    private String imageName;
    private byte[] blob;
}
