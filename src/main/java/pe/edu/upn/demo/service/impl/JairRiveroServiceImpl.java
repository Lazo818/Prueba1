package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.JairRivero;
import pe.edu.upn.demo.model.repository.JairRiveroRepository;
import pe.edu.upn.demo.service.JairRiveroService;

@Service
public class JairRiveroServiceImpl implements JairRiveroService{
	
	@Autowired
	private JairRiveroRepository jairRiveroRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<JairRivero> findAll() throws Exception {
		// TODO Auto-generated method stub
		return jairRiveroRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<JairRivero> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return jairRiveroRepository.findById(id);
	}
	
	@Transactional
	@Override
	public JairRivero save(JairRivero entity) throws Exception {
		// TODO Auto-generated method stub
		return jairRiveroRepository.save(entity);
	}
	
	@Transactional
	@Override
	public JairRivero update(JairRivero entity) throws Exception {
		// TODO Auto-generated method stub
		return jairRiveroRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		jairRiveroRepository.deleteById(id);
		
	}
	
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		jairRiveroRepository.deleteAll();
		
	}

}
