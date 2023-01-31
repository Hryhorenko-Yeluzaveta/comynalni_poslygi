package ua.com.composlyg.comynalni_poslygi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.composlyg.comynalni_poslygi.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
