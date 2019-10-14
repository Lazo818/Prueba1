package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.EnzoCastillo;
import pe.edu.upn.demo.model.repository.EnzoCastilloRepository;
import pe.edu.upn.demo.service.EnzoCastilloService;

public class EnzoCastilloServiceImpl implements EnzoCastilloService {

	@Autowired
	private EnzoCastilloRepository enzoCastilloRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<EnzoCastillo> findAll() throws Exception {
		return enzoCastilloRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<EnzoCastillo> findById(String id) throws Exception {
		return enzoCastilloRepository.findById(id);
	}

	@Override
	public EnzoCastillo save(EnzoCastillo entity) throws Exception {
		return enzoCastilloRepository.save(entity);
	}

	@Override
	public EnzoCastillo update(EnzoCastillo entity) throws Exception {
		return enzoCastilloRepository.save(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		enzoCastilloRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		enzoCastilloRepository.deleteAll();
		
	}

}
