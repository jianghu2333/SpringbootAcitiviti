package com.demo.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Description
 * @Author Jh
 * @Date 2020/10/8 16:02
 * @Version 1.0
 */
@Data
@Document(indexName = "people",type ="docs",shards = 2,replicas = 2)
public class People {
    @Id
    private Long id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;
    @Field(type = FieldType.Integer)
    private Integer age;
    @Field(type = FieldType.Keyword)
    private String hobby;
    @Field(type = FieldType.Keyword)
    private String description;
}
