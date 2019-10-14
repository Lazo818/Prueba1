package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.JosselynSanchez;
import pe.edu.upn.demo.model.repository.JosselynSanchezRepository;
import pe.edu.upn.demo.service.JosselynSanchezService;


@Service
public class JosselynSanchezServiceImpl implements JosselynSanchezService{

	@Autowired
	private JosselynSanchezRepository josselynsanchezrepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<JosselynSanchez> findAll() throws Exception {
		// TODO Auto-generated method stub
		return josselynsanchezrepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<JosselynSanchez> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return josselynsanchezrepository.findById(id);
	}
	@Transactional
	@Override
	public JosselynSanchez save(JosselynSanchez entity) throws Exception {
		// TODO Auto-generated method stub
		return josselynsanchezrepository.save(entity);
	}
	@Transactional
	@Override
	public JosselynSanchez update(JosselynSanchez entity) throws Exception {
		// TODO Auto-generated method stub
		return josselynsanchezrepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		josselynsanchezrepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		josselynsanchezrepository.deleteAll();
	}

}
