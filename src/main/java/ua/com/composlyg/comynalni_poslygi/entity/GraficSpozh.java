package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class GraficSpozh {
    private Long id;
    private Date dateSpozh;
    private String payment;
    private boolean statusPayment;
    private Abonent abonent;
    private List<PokaznukiHasGraficSpozh> pokaznukiHasGraficSpozhList;

}
