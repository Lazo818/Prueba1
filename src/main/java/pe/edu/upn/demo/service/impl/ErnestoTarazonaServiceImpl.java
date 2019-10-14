package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.ErnestoTarazona;
import pe.edu.upn.demo.model.repository.ErnestoTarazonaRepository;
import pe.edu.upn.demo.service.ErnestoTarazonaService;

public class ErnestoTarazonaServiceImpl implements ErnestoTarazonaService{

	@Autowired
	private ErnestoTarazonaRepository ernestoTarazonaRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<ErnestoTarazona> findAll() throws Exception {
		
		return ernestoTarazonaRepository.findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public Optional<ErnestoTarazona> findById(Integer id) throws Exception {
		
		return ernestoTarazonaRepository.findById(id);
	}

	@Transactional
	@Override
	public ErnestoTarazona save(ErnestoTarazona entity) throws Exception {
		
		return ernestoTarazonaRepository.save(entity);
	}

	@Transactional
	@Override
	public ErnestoTarazona update(ErnestoTarazona entity) throws Exception {
		
		return ernestoTarazonaRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		ernestoTarazonaRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		ernestoTarazonaRepository.deleteAll();
		
	}

}
