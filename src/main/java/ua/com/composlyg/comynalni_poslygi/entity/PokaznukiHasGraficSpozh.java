package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PokaznukiHasGraficSpozh {
    private Long id;
    private Pokaznuki pokaznuki;
    private GraficSpozh graficSpozh;
    private int quantity;
}
