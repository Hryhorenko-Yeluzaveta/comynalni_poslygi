package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ComynPoslygi {

    private Long id;
    private String name;
    private String description;
    private BigDecimal tarif;
private List<Pokaznuki> pokaznukiList;
}
