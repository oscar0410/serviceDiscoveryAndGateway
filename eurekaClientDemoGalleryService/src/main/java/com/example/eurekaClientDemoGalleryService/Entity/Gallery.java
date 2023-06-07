package com.example.eurekaClientDemoGalleryService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallery {
    private int id;
    private List<Object> images;
}
