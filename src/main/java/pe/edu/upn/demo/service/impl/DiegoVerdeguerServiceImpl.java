package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.DiegoVerdeguer;
import pe.edu.upn.demo.model.repository.DiegoVerdeguerRepository;
import pe.edu.upn.demo.service.DiegoVerdeguerService;

@Service
public class DiegoVerdeguerServiceImpl implements DiegoVerdeguerService{
	
	@Autowired
	private DiegoVerdeguerRepository diegoVerdeguerRepository;
	
	
	@Transactional(readOnly = true)

	@Override
	public List<DiegoVerdeguer> findAll() throws Exception {
		// TODO Auto-generated method stub
		return diegoVerdeguerRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DiegoVerdeguer> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return diegoVerdeguerRepository.findById(id);
	}

	@Transactional
	@Override
	public DiegoVerdeguer save(DiegoVerdeguer entity) throws Exception {
		// TODO Auto-generated method stub
		return diegoVerdeguerRepository.save(entity);
	}

	@Transactional
	@Override
	public DiegoVerdeguer update(DiegoVerdeguer entity) throws Exception {
		// TODO Auto-generated method stub
		return diegoVerdeguerRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		diegoVerdeguerRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		diegoVerdeguerRepository.deleteAll();
		
	}

}
