package ua.com.composlyg.comynalni_poslygi.entity;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {
    private Long id;
    private String username;
    private String password;
    private Set<Roles> rolesSet;
}
