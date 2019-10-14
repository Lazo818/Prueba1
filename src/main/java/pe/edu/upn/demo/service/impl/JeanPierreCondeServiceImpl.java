package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.JeanPierreConde;
import pe.edu.upn.demo.model.repository.JeanPierreCondeRepository;
import pe.edu.upn.demo.service.JeanPierreCondeService;

public class JeanPierreCondeServiceImpl implements JeanPierreCondeService {
	@Autowired
	private JeanPierreCondeRepository jeanPierreCondeRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<JeanPierreConde> findAll() throws Exception {
		return jeanPierreCondeRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<JeanPierreConde> findById(String id) throws Exception {
		return jeanPierreCondeRepository.findById(id);
	}
	@Transactional
	@Override
	public JeanPierreConde save(JeanPierreConde entity) throws Exception {
		return jeanPierreCondeRepository.save(entity);
	}
	@Transactional
	@Override
	public JeanPierreConde update(JeanPierreConde entity) throws Exception {
		return jeanPierreCondeRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		jeanPierreCondeRepository.deleteById(id);;
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		jeanPierreCondeRepository.deleteAll();
	}

}
