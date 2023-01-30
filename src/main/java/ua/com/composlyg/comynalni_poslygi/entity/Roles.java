package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Roles {
    private Long id;
    private String name;
    private Set<Users> usersSet;
}
