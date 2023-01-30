package ua.com.composlyg.comynalni_poslygi.entity;


import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Pokaznuki {
    private Long id;
    private String namePoslyg;
    private Date datePokaznuka;
    private int Pokaznuk;
    private BigDecimal totalBill;
    private ComynPoslygi comynPoslygi;
    private List<PokaznukiHasGraficSpozh> pokaznukiHasGraficSpozhList;
    private List<AttributeHasPokaznuki> attributeHasPokaznukiList;
}
