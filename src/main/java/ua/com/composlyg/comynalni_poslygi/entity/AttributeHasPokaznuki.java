package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AttributeHasPokaznuki {
    private Long id;
    private Attribute attribute;
    private Pokaznuki pokaznuki;
}
