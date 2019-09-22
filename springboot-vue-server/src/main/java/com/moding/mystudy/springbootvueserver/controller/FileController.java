package com.moding.mystudy.springbootvueserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 邢卫东
 * @date 2019/9/22
 * @description com.moding.mystudy.springbootvueserver.controller
 */

@RestController
public class FileController {

    @RequestMapping("upload")
    public String fileUpload(){

        return "文件上传成功！";
    }

}
