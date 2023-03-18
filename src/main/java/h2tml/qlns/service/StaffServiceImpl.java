package h2tml.qlns.service;

import java.util.List;
import java.util.Optional;

import h2tml.qlns.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import h2tml.qlns.model.Staffs;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
    StaffRepository staffRepository;

	@Override
	public List<Staffs>  save(Staffs entity) {
		return (List<Staffs>) staffRepository.save(entity);
	}

	@Override
	public Optional<Staffs> findById(Long id) {
		return staffRepository.findById(id);
	}

	@Override
	public List<Staffs> findAll() {
		return (List<Staffs>) staffRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		staffRepository.deleteById(id);
	}
	
	
}
