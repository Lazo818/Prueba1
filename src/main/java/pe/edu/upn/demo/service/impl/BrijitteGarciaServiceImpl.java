package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.BrijitteGarcia;
import pe.edu.upn.demo.model.repository.BrijitteGarciaRepository;
import pe.edu.upn.demo.service.BrijitteGarciaService;

@Service
public class BrijitteGarciaServiceImpl implements BrijitteGarciaService{
	
	@Autowired
	private BrijitteGarciaRepository brijittegarciarepository;

	@Transactional(readOnly = true)
	@Override
	public List<BrijitteGarcia> findAll() throws Exception {
		// TODO Auto-generated method stub
		return brijittegarciarepository.findAll();
	}

	@Transactional
	@Override
	public Optional<BrijitteGarcia> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return brijittegarciarepository.findById(id);
	}

	@Transactional
	@Override
	public BrijitteGarcia save(BrijitteGarcia entity) throws Exception {
		// TODO Auto-generated method stub
		return brijittegarciarepository.save(entity);
	}

	@Transactional
	@Override
	public BrijitteGarcia update(BrijitteGarcia entity) throws Exception {
		// TODO Auto-generated method stub
		return brijittegarciarepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		brijittegarciarepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		brijittegarciarepository.deleteAll();
	}

}
