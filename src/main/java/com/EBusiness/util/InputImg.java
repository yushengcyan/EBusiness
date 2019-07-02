package com.EBusiness.util;


import org.springframework.web.multipart.MultipartFile;

public class InputImg {
    MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
