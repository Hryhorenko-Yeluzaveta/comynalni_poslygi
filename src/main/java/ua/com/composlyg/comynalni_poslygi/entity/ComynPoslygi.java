package ua.com.composlyg.comynalni_poslygi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "comyn_poslyga")
public class ComynPoslygi {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private BigDecimal tarif;

    @OneToMany(mappedBy = "comyn_poslygi")
private List<Pokaznuk> pokaznukList;
}
