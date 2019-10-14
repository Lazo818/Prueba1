package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.SebastianSegura;
import pe.edu.upn.demo.model.repository.SebastianSeguraRepository;
import pe.edu.upn.demo.service.SebastianSeguraService;


@Service
public class SebastianSeguraServiceImpl implements SebastianSeguraService {

	@Autowired
	private SebastianSeguraRepository sebastianseguraRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<SebastianSegura> findAll() throws Exception {
		return sebastianseguraRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<SebastianSegura> findById(Integer id) throws Exception {
		return sebastianseguraRepository.findById(id);
	}
	@Transactional
	@Override
	public SebastianSegura save(SebastianSegura entity) throws Exception {
		return sebastianseguraRepository.save(entity);
	}
	@Transactional
	@Override
	public SebastianSegura update(SebastianSegura entity) throws Exception {
		return sebastianseguraRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		sebastianseguraRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		sebastianseguraRepository.deleteAll();
	}

}
