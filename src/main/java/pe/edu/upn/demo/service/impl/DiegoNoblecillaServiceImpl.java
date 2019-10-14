package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.DiegoNoblecilla;
import pe.edu.upn.demo.model.repository.DiegoNoblecillaRepository;
import pe.edu.upn.demo.service.DiegoNoblecillaService;

@Service
public class DiegoNoblecillaServiceImpl implements DiegoNoblecillaService{

	
	@Autowired
	private DiegoNoblecillaRepository diegoNoblecillaRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<DiegoNoblecilla> findAll() throws Exception {
		// TODO Auto-generated method stub
		return diegoNoblecillaRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DiegoNoblecilla> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return diegoNoblecillaRepository.findById(id);
	}

	@Transactional
	@Override
	public DiegoNoblecilla save(DiegoNoblecilla entity) throws Exception {
		// TODO Auto-generated method stub
		return diegoNoblecillaRepository.save(entity);
	}

	@Transactional
	@Override
	public DiegoNoblecilla update(DiegoNoblecilla entity) throws Exception {
		// TODO Auto-generated method stub
		return diegoNoblecillaRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		diegoNoblecillaRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		diegoNoblecillaRepository.deleteAll();
	}

}
