package com.productforge.hsc.lostvoices.rest;

import com.productforge.hsc.lostvoices.dao.LocalImagesDao;
import com.productforge.hsc.lostvoices.dao.domain.LocalImageEntity;
import com.productforge.hsc.lostvoices.pojos.LocalImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
public class LocalVoicesController {

    @Autowired
    private LocalImagesDao localImagesDao;

    @GetMapping("/serverip")
    public String hello(HttpServletRequest request) {

        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    @CrossOrigin(origins ="*")
    @PostMapping(value = "/upload", consumes = MediaType.ALL_VALUE)
    public String uploadImage(@RequestBody LocalImage localImage) {
        LocalImageEntity localImageEntity = new LocalImageEntity();
        localImageEntity.setImageName(localImage.getImageName());
        localImageEntity.setBlob(localImage.getBlob());
        System.out.println(localImagesDao.saveAndFlush(localImageEntity));
        localImagesDao.flush();
        return "SUCCESS";
    }

    @GetMapping(value = "/getImages")
    public List<LocalImageEntity> getLocalImageEntities() {
        return localImagesDao.findAll();
    }
}
