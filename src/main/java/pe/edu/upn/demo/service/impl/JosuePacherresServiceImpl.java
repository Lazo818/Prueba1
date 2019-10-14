package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upn.demo.model.entity.JosuePacherres;
import pe.edu.upn.demo.model.repository.JosuePacherresRepository;
import pe.edu.upn.demo.service.JosuePacherresService;

public class JosuePacherresServiceImpl implements JosuePacherresService{

	@Autowired
	private JosuePacherresRepository josueRepository;
	
	@Override
	public List<JosuePacherres> findAll() throws Exception {
		return josueRepository.findAll();
	}

	@Override
	public Optional<JosuePacherres> findById(String id) throws Exception {
		return josueRepository.findById(id);
	}

	@Override
	public JosuePacherres save(JosuePacherres entity) throws Exception {
		return josueRepository.save(entity);
	}

	@Override
	public JosuePacherres update(JosuePacherres entity) throws Exception {
		return josueRepository.save(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		josueRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		josueRepository.deleteAll();
	}
	
	

}
