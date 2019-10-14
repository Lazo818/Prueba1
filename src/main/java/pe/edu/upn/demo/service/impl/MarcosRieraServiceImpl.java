package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.MarcosRiera;
import pe.edu.upn.demo.model.repository.MarcosRieraRepository;
import pe.edu.upn.demo.service.MarcosRieraService;

@Service
public class MarcosRieraServiceImpl implements MarcosRieraService{

	@Autowired
	private MarcosRieraRepository marcosrieraRepository;
	
	
	
	@Transactional(readOnly = true)
	@Override
	public List<MarcosRiera> findAll() throws Exception {
		return marcosrieraRepository.findAll();
	}

	
	@Transactional(readOnly = true)
	@Override
	public Optional<MarcosRiera> findById(String id) throws Exception {
	 return marcosrieraRepository.findById(id);
	}

	 
	@Transactional
	@Override
	public MarcosRiera save(MarcosRiera entity) throws Exception {
		return marcosrieraRepository.save(entity);
	}
	
	   
	
	@Transactional
	@Override
	public MarcosRiera update(MarcosRiera entity) throws Exception {
		return marcosrieraRepository.save(entity);
	}
	 
	
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		marcosrieraRepository.deleteById(id);
		
	}
	
	
	
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		marcosrieraRepository.deleteAll();
		
	}

}
