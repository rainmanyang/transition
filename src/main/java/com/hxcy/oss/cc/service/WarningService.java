package com.hxcy.oss.cc.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.persistence.DynamicSpecifications;
import org.springside.modules.persistence.SearchFilter;

import com.hxcy.oss.cc.domain.Warning;
import com.hxcy.oss.cc.repository.WarningRepository;

@Service
public class WarningService {
	
	@Resource
	private WarningRepository warningRepository;

	@Transactional(readOnly = true)
	public Page<Warning> find(List<SearchFilter> filters, int page, int size) {
		Specification<Warning> spec = DynamicSpecifications.bySearchFilter(filters, Warning.class);
		return warningRepository.findAll(spec, new PageRequest(page, size, Direction.DESC, "rfid"));
	}
	
	@Transactional
	public void close(Integer id, String opinion) {
		Warning warning = warningRepository.findOne(id);
		warning.setOpinion(opinion);
		warning.setCloseTime(new Date());
		warning.setStatus(Warning.STATUS_CLOSED);
		warningRepository.save(warning);
	}

}
