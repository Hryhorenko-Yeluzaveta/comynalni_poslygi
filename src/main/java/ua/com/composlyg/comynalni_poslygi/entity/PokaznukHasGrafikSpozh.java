package ua.com.composlyg.comynalni_poslygi.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "pokaznuk_has_graficSpozh")
public class PokaznukHasGrafikSpozh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pokaznuk_id")
    private Pokaznuk pokaznuk;

    @ManyToOne
    @JoinColumn(name = "grafikSpozh_id")
    private GrafikSpozh grafikSpozh;

    private int quantity;
}
