package com.prmentor.demo.repository;

import org.springframework.stereotype.Repository;

import com.prmentor.demo.repository.modelo.Reporte;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class ReporteRepositoryImpl implements IReporteRepository{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.REQUIRED)

	public void guardar(Reporte reporte) {
		
		this.entityManager.persist(reporte);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Reporte buscarPorId(Integer Id) {
		return this.entityManager.find(Reporte.class, Id);
		// TODO Auto-generated method stub
		
	}

}
