package com.example.jobservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto {
    private String id;
    private String name;
    private String description;
    private List<String> image;
    private List<JobDto> jobs;

}
