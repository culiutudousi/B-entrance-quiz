package com.thoughtworks.capability.gtb.entrancequiz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//TODO GTB-知识点: - Student.java:8 了解下如果导入Lombok包
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
}
