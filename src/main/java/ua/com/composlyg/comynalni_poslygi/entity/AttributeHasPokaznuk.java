package ua.com.composlyg.comynalni_poslygi.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "attribute_has_pokaznuk")
public class AttributeHasPokaznuk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @ManyToOne
   @JoinColumn(name = "attribute_id")
    private Attribute attribute;
    @ManyToOne
    @JoinColumn(name = "pokaznuku_id")
    private Pokaznuk pokaznuku;
}
