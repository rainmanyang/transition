package com.hxcy.oss.cc.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hxcy.oss.cc.domain.Warning;

public interface WarningRepository extends PagingAndSortingRepository<Warning, Integer>, JpaSpecificationExecutor<Warning> {

}
