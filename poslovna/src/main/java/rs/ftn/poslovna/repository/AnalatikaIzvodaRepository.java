package rs.ftn.poslovna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ftn.poslovna.domain.AnalitikaIzvoda;

@Repository
public interface AnalatikaIzvodaRepository extends JpaRepository<AnalitikaIzvoda, Long> {

}
