package ua.com.composlyg.comynalni_poslygi.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "pokaznuks")
public class Pokaznuk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namePoslyg;
    private Date datePokaznuka;
    private int Pokaznuk;
    private BigDecimal totalBill;
    @ManyToOne
    @JoinColumn(name = "poslyga_id")
    private ComynPoslygi comyn_poslygi;

    @OneToMany(mappedBy = "pokaznuk")
    private List<PokaznukHasGrafikSpozh> pokaznukHasGrafikuSpozh;

    @OneToMany(mappedBy = "pokaznuku")
    private List<AttributeHasPokaznuk> attributeHasPokaznukList;
}
