package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.JeanTalancha;
import pe.edu.upn.demo.model.repository.JeanTalanchaRepository;
import pe.edu.upn.demo.service.JeanTalanchaService;
@Service
public class JeanTalanchaServiceImpl implements JeanTalanchaService {
	@Autowired
	private JeanTalanchaRepository jeanTalanchaRepository; 
	
	@Transactional(readOnly = true)
	@Override
	public List<JeanTalancha> findAll() throws Exception {
		
		return jeanTalanchaRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<JeanTalancha> findById(Integer id) throws Exception {
		
		return jeanTalanchaRepository.findById(id);
	}
	@Transactional
	@Override
	public JeanTalancha save(JeanTalancha entity) throws Exception {
		
		return jeanTalanchaRepository.save(entity);
	}
	@Transactional
	@Override
	public JeanTalancha update(JeanTalancha entity) throws Exception {
	
		return jeanTalanchaRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
	
		jeanTalanchaRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		
		jeanTalanchaRepository.deleteAll();
	}

}
