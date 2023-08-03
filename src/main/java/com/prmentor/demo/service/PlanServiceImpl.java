package com.prmentor.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prmentor.demo.repository.IPlanRepository;
import com.prmentor.demo.repository.modelo.Plan;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class PlanServiceImpl implements IPlanService {

	@Autowired
	private IPlanRepository iPlanRepository;
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)

	public void guardar(Plan plan) {
		// TODO Auto-generated method stub
		this.iPlanRepository.guardar(plan);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)

	public Plan buscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.buscarPorId(Id);
	}

}
