package com.vignesh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsModel {
    private String id;
    private String title;
    private String content;
    private String imgPath;
    private String[] tags;
    private String link;
    private boolean live;
}
