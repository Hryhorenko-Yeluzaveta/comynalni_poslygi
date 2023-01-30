package ua.com.composlyg.comynalni_poslygi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "abonents")
public class Abonent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private int age;
    private String address;
    private int phone;
    private String email;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    private Users user;

    @OneToMany(mappedBy = "abonentes")
    private List<Address> addressList;

    @OneToMany(mappedBy = "abonent")
    private List<GrafikSpozh> grafikSpozhList;

}
