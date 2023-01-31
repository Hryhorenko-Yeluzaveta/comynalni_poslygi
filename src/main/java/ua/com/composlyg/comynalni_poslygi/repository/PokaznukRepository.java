package ua.com.composlyg.comynalni_poslygi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.composlyg.comynalni_poslygi.entity.Pokaznuk;

@Repository
public interface PokaznukRepository extends JpaRepository<Pokaznuk, Long> {
}
