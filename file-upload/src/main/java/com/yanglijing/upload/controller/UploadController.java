package com.yanglijing.upload.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @Value("${file.upload.dir}")
    private String fileDir;

    @RequestMapping("/head_pic")
    public String uploadHeadPic(@RequestParam("file") MultipartFile multipartFile){

        String oldName = multipartFile.getOriginalFilename();
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        String newName = UUID.randomUUID().toString()+suffix;

        FileOutputStream fos = null;
        InputStream is = null;

        //储存
        try {

           // multipartFile.transferTo(new File("D:/pic"));
            fos = new FileOutputStream(new File(fileDir,newName));
            is = multipartFile.getInputStream();

            byte[] arr = new byte[1024*1024];
            int length = 0;
            while ((length = is.read(arr)) != -1){
                fos.write(arr,0,length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                is.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String url = "http://127.0.0.1:9096/"+newName;
        System.out.println("==========================="+url);
        return url;



    }
}
