package com.hxcy.oss.cc.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hxcy.oss.cc.domain.Asset;
import com.hxcy.oss.cc.repository.AssetRepository;

@Service
public class AssetService {
	
	@Resource
	private AssetRepository assetRepository;
	
	/**
	 * 更新或保存
	 * @param room
	 */
	@Transactional
	public void saveOrUpdate(Asset asset) {
		assetRepository.save(asset);
	}
	
	/**
	 * 删除
	 * @param rfid
	 */
	@Transactional
	public void delete(String rfid) {
		assetRepository.delete(rfid);
	}
	
	/**
	 * 分页查询数据
	 * @param name
	 * @param page
	 * @param size
	 * @return
	 */
	@Transactional(readOnly = true)
	public Page<Asset> find(final String name, final Integer regionId, final String roomSN, int page, int size) {
		Specification<Asset> spec = new Specification<Asset>() {
			public Predicate toPredicate(Root<Asset> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				if (!StringUtils.isBlank(roomSN)) {
					predicates.add(cb.equal(root.get("room").get("sn"), roomSN));
				}
				if (regionId != null) {
					predicates.add(cb.equal(root.get("room").get("region_id"), regionId));
				}
				if (!StringUtils.isBlank(name)) {
					Path<String> p =  root.get("name");
					predicates.add(cb.like(p, "%" + name + "%"));
				}
				if (!predicates.isEmpty()) {
					return cb.and(predicates.toArray(new Predicate[predicates.size()]));
				}
				return cb.conjunction();
			}};
		return assetRepository.findAll(spec, new PageRequest(page, size, Direction.DESC, "rfid"));
	}
}
