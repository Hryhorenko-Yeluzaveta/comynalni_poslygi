package ua.com.composlyg.comynalni_poslygi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@Table(name = "grafiku_spozhivannya")
public class GrafikSpozh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateSpozh;
    private String payment;
    private boolean statusPayment;

    @ManyToOne
    @JoinColumn(name = "abonents_id")
    private Abonent abonent;

    @OneToMany(mappedBy = "grafikSpozh")
    private List<PokaznukHasGrafikSpozh> pokaznukHasGrafikuSpozhList;

}
