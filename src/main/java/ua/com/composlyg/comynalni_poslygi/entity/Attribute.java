package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Attribute {
    private Long id;
    private String name;
    private String description;
    private String unit;
    private List<AttributeHasPokaznuki> attributeHasPokaznukiList;
}
