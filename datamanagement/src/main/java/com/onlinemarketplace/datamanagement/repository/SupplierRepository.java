package com.onlinemarketplace.datamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlinemarketplace.dataentity.domain.Supplier;


@Repository
@Transactional
public interface SupplierRepository extends JpaRepository< Supplier,Long> {

}
