package com.productforge.hsc.lostvoices.rest;

import com.productforge.hsc.lostvoices.pojos.LocalImage;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LocalVoicesControllerTest {
    public static void main(String[] args) throws Exception {
        LocalVoicesControllerTest controllerTest = new LocalVoicesControllerTest();
        RestTemplate restTemplate = new RestTemplate();
        LocalImage localImage = new LocalImage();

        localImage.setImageName("Gorbal1960.jpg");
        localImage.setBlob(controllerTest.getImageBinary());
        HttpEntity<String> request = new HttpEntity(localImage);
        String response = restTemplate.postForObject("http://localhost:8085/upload", request, String.class);
        System.out.println(response);
    }

    public byte[] getImageBinary() throws Exception {

        Path path = Paths.get(getClass().getClassLoader()
                .getResource("canmore_image_SC00513930.jpg").toURI());
        byte[] fileBytes = Files.readAllBytes(path);
        return fileBytes;
    }
}
