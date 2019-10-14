package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.LuisSuarez;
import pe.edu.upn.demo.model.repository.LuisSuarezRepository;
import pe.edu.upn.demo.service.LuisSuarezService;

@Service
public class LuisSuarezServiceImpl implements LuisSuarezService{
	
	@Autowired
	private LuisSuarezRepository luisRepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<LuisSuarez> findAll() throws Exception {
		// TODO Auto-generated method stub
		return luisRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<LuisSuarez> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return luisRepository.findById(id);
	}

	@Transactional
	@Override
	public LuisSuarez save(LuisSuarez entity) throws Exception {
		// TODO Auto-generated method stub
		return luisRepository.save(entity);
	}

	@Transactional
	@Override
	public LuisSuarez update(LuisSuarez entity) throws Exception {
		// TODO Auto-generated method stub
		return luisRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		luisRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		luisRepository.deleteAll();
	}

}
