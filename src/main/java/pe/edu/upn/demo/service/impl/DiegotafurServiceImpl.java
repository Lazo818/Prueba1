package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.DiegoTafur;
import pe.edu.upn.demo.model.repository.DiegoTafurRepository;
import pe.edu.upn.demo.service.DiegotafurService;

@Service
public class DiegotafurServiceImpl implements DiegotafurService {

	@Autowired
	private DiegoTafurRepository diegotafurR;
	@Override
	@Transactional(readOnly = true)
	public List<DiegoTafur> findAll() throws Exception {
		return diegotafurR.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DiegoTafur> findById(String id) throws Exception {
		return diegotafurR.findById(id);
	}
	@Transactional
	@Override
	public DiegoTafur save(DiegoTafur entity) throws Exception {
		return diegotafurR.save(entity);
	}
	@Transactional
	@Override
	public DiegoTafur update(DiegoTafur entity) throws Exception {
		return diegotafurR.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		this.diegotafurR.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		this.diegotafurR.deleteAll();
	}

}
