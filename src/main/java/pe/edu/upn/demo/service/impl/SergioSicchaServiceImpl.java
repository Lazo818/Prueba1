package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.SergioSiccha;
import pe.edu.upn.demo.model.repository.SergioSicchaRepository;
import pe.edu.upn.demo.service.SergioSicchaService;

public class SergioSicchaServiceImpl implements SergioSicchaService{
	
	@Autowired
	private SergioSicchaRepository sergiosicchaRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<SergioSiccha> findAll() throws Exception {
		return sergiosicchaRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<SergioSiccha> findById(Integer id) throws Exception {
		return sergiosicchaRepository.findById(id);
	}

	@Transactional
	@Override
	public SergioSiccha save(SergioSiccha entity) throws Exception {
		return sergiosicchaRepository.save(entity);
	}

	@Transactional
	@Override
	public SergioSiccha update(SergioSiccha entity) throws Exception {
		return sergiosicchaRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		sergiosicchaRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		sergiosicchaRepository.deleteAll();
	}

}
