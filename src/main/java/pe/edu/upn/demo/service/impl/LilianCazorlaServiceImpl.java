package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.LilianCazorla;
import pe.edu.upn.demo.model.repository.LilianCazorlaRepository;
import pe.edu.upn.demo.service.LilianCazorlaService;

@Service
public class LilianCazorlaServiceImpl implements LilianCazorlaService{

	@Autowired
	private LilianCazorlaRepository lilianCazorlaRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<LilianCazorla> findAll() throws Exception {
		
		return lilianCazorlaRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<LilianCazorla> findById(Integer id) throws Exception {
		
		return lilianCazorlaRepository.findById(id);
	}

	@Transactional
	@Override
	public LilianCazorla save(LilianCazorla entity) throws Exception {
		
		return lilianCazorlaRepository.save(entity);
	}

	@Transactional
	@Override
	public LilianCazorla update(LilianCazorla entity) throws Exception {
		
		return lilianCazorlaRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		
		lilianCazorlaRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		
		lilianCazorlaRepository.deleteAll();
		
	}

}
