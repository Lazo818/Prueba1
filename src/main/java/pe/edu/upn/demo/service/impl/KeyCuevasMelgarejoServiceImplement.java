package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.KeyCuevasMelgarejo;
import pe.edu.upn.demo.model.repository.KeyCuevasMelgarejoRepository;
import pe.edu.upn.demo.service.KeyCuevasMelgarejoService;

@Service
public class KeyCuevasMelgarejoServiceImplement implements KeyCuevasMelgarejoService{

	@Autowired
	private KeyCuevasMelgarejoRepository keycuevasmelgarejoRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<KeyCuevasMelgarejo> findAll() throws Exception {
		return keycuevasmelgarejoRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<KeyCuevasMelgarejo> findById(Integer id) throws Exception {
		return keycuevasmelgarejoRepository.findById(id);
	}

	@Transactional
	@Override
	public KeyCuevasMelgarejo save(KeyCuevasMelgarejo entity) throws Exception {
		return keycuevasmelgarejoRepository.save(entity);
	}

	@Transactional
	@Override
	public KeyCuevasMelgarejo update(KeyCuevasMelgarejo entity) throws Exception {
		return keycuevasmelgarejoRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		keycuevasmelgarejoRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		keycuevasmelgarejoRepository.deleteAll();
	}

}
