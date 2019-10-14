package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.JohanPizarro;
import pe.edu.upn.demo.model.repository.JohanPizarroRepository;
import pe.edu.upn.demo.service.JohanPizarroService;

@Service
public class JohanPizarroImpl implements JohanPizarroService {
	
	@Autowired
	private JohanPizarroRepository johanpizarrorepository;
	@Transactional(readOnly= true)
	@Override
	public List<JohanPizarro> findAll() throws Exception {
		return johanpizarrorepository.findAll();
	}
	@Transactional(readOnly= true)
	@Override
	public Optional<JohanPizarro> findById(String id) throws Exception {
		return johanpizarrorepository.findById(id);
	}

	@Transactional
	@Override
	public JohanPizarro save(JohanPizarro entity) throws Exception {
		return johanpizarrorepository.save(entity);
	}
	@Transactional
	@Override
	public JohanPizarro update(JohanPizarro entity) throws Exception {
		return johanpizarrorepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		johanpizarrorepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		johanpizarrorepository.deleteAll();
		
	}

}
