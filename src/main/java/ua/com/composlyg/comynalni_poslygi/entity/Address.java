package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {
    private Long id;
    private String city;
    private String building;
    private int numberApartment;
    private Abonent abonent;
}
