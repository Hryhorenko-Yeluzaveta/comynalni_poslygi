package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Abonent {
    private Long id;
    private String firstName;
    private String secondName;
    private int age;
    private String address;
    private int phone;
    private String email;

    private Users user;
    private List<Address> addressList;
    private List<GraficSpozh> graficSpozhList;

}
