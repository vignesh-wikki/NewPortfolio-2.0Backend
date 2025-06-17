package com.vignesh.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProjectsModel {
    private String id;
    private String title;
    private String content;
    private String imgPath;
    private String[] tags;
    private String link;
    private boolean live;
}
