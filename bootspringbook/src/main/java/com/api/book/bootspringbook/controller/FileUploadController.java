package com.api.book.bootspringbook.controller;

import com.api.book.bootspringbook.helper.FileUploadHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileUploadController {
    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        try {
            if (file.isEmpty()) {

                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must contain file");
            }

            if (!file.getContentType().equals("image/jpeg")) {

                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg is allowed");

            }

            // file upload code..

            boolean f = fileUploadHelper.uploadFile(file);
            if (f) {
                /* return ResponseEntity.ok().body("file is successfully uploaded"); */

                return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/")
                        .path(file.getOriginalFilename()).toUriString());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Something went wrong...please try again later");
    }
}
