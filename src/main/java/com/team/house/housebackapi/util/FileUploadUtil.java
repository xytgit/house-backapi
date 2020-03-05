package com.team.house.housebackapi.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUploadUtil {
    public static String upload(MultipartFile multipartFile, String path){
        try {
            String name = multipartFile.getOriginalFilename();
            String ext=name.substring(name.lastIndexOf("."));
            String fileName = System.currentTimeMillis() + ext;
            multipartFile.transferTo(new File(path + "/" + fileName));
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
