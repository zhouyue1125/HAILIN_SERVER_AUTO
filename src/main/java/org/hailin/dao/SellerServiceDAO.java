package org.hailin.dao;

import org.apache.ibatis.annotations.Param;
import org.hailin.entity.Seller;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerServiceDAO {
	Seller login(@Param("seller_id") String seller_id,@Param("seller_pwd") String seller_pwd);
}
