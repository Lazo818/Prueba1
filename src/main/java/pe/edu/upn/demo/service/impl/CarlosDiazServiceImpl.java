package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.CarlosDiaz;
import pe.edu.upn.demo.model.repository.CarlosDiazRepository;
import pe.edu.upn.demo.service.CarlosDiazService;

public class CarlosDiazServiceImpl implements CarlosDiazService{
	
	@Autowired
	private CarlosDiazRepository carlosdiazRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<CarlosDiaz> findAll() throws Exception {
		return carlosdiazRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<CarlosDiaz> findById(Integer id) throws Exception {
		return carlosdiazRepository.findById(id);
	}
	@Transactional
	@Override
	public CarlosDiaz save(CarlosDiaz entity) throws Exception {
		return carlosdiazRepository.save(entity);
	}
	@Transactional
	@Override
	public CarlosDiaz update(CarlosDiaz entity) throws Exception {
		return carlosdiazRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		carlosdiazRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		carlosdiazRepository.deleteAll();
	}

}
