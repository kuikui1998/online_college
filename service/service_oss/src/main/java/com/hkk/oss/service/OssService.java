package com.hkk.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @auther kuikui
 * @create 2020-09-21 13:54
 */
public interface OssService {
    //上传头像到oss
    String uploadFileAvatar(MultipartFile file);
}
