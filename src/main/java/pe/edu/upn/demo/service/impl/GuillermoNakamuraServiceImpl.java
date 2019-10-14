package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.GuillermoNakamura;
import pe.edu.upn.demo.model.repository.GuillermoNakamuraRepository;
import pe.edu.upn.demo.service.GuillermoNakamuraService;

@Service
public class GuillermoNakamuraServiceImpl implements GuillermoNakamuraService{
	
	@Autowired
	private GuillermoNakamuraRepository guillermo;

	@Transactional(readOnly = true)
	@Override
	public List<GuillermoNakamura> findAll() throws Exception {
		return guillermo.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<GuillermoNakamura> findById(String id) throws Exception {
		return guillermo.findById(id);
	}

	@Transactional
	@Override
	public GuillermoNakamura save(GuillermoNakamura entity) throws Exception {
		return guillermo.save(entity);
	}

	@Transactional
	@Override
	public GuillermoNakamura update(GuillermoNakamura entity) throws Exception {
		return guillermo.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		guillermo.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		guillermo.deleteAll();
	}
	
	

}
