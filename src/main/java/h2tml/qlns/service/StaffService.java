package h2tml.qlns.service;

import java.util.List;
import java.util.Optional;


import h2tml.qlns.model.Staffs;

public interface StaffService {

	void deleteById(Long id);

	Iterable<Staffs> findAll();

	Optional<Staffs> findById(Long id);

	List<Staffs> save(Staffs entity);

	

	

}
