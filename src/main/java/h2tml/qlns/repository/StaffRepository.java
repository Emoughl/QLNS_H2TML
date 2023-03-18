package h2tml.qlns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import h2tml.qlns.model.Staffs;

@Repository
public interface StaffRepository extends CrudRepository<Staffs,Long>{

}
