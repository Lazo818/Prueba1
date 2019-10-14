package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.AdrianMorgan;
import pe.edu.upn.demo.model.repository.AdrianMorganRepository;
import pe.edu.upn.demo.service.AdrianMorganService;

@Service
public class AdrianMorganServiceImpl implements AdrianMorganService{
	
	@Autowired
	private AdrianMorganRepository amRepository;

	@Transactional(readOnly = true)
	@Override
	public List<AdrianMorgan> findAll() throws Exception {
		return amRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<AdrianMorgan> findById(String id) throws Exception {
		return amRepository.findById(id);
	}

	@Transactional
	@Override
	public AdrianMorgan save(AdrianMorgan entity) throws Exception {
		return amRepository.save(entity);
	}

	@Transactional
	@Override
	public AdrianMorgan update(AdrianMorgan entity) throws Exception {

		return amRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		amRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		amRepository.deleteAll();
		
	}

}
