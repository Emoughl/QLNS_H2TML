package h2tml.qlns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import h2tml.qlns.model.Departs;

@Repository
public interface DepartRepository extends CrudRepository<Departs,Long> {

}
