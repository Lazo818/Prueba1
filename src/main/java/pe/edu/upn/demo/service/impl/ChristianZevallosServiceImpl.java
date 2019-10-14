package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.ChristianZevallos;
import pe.edu.upn.demo.model.repository.ChristianZevallosRepository;
import pe.edu.upn.demo.service.ChristianZevallosService;

public class ChristianZevallosServiceImpl implements ChristianZevallosService{
	
	@Autowired
	private ChristianZevallosRepository christianzevallosrepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<ChristianZevallos> findAll() throws Exception {
		// TODO Auto-generated method stub
		return christianzevallosrepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<ChristianZevallos> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return christianzevallosrepository.findById(id);
	}

	@Transactional
	@Override
	public ChristianZevallos save(ChristianZevallos entity) throws Exception {
		// TODO Auto-generated method stub
		return christianzevallosrepository.save(entity);
	}

	@Transactional
	@Override
	public ChristianZevallos update(ChristianZevallos entity) throws Exception {
		// TODO Auto-generated method stub
		return christianzevallosrepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		christianzevallosrepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		christianzevallosrepository.deleteAll();
	}

}
