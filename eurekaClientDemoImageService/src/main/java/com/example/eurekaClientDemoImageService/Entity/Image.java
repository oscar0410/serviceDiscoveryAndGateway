package com.example.eurekaClientDemoImageService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private int imageId;
    private String imageName;
    private String imageUrl;
}
