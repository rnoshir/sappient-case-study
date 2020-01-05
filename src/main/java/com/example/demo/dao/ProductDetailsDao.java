package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.ProductDetailsDto;

public interface ProductDetailsDao extends JpaRepository<ProductDetailsDto, Long> {

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID", nativeQuery = true)
	List<Object[]> findProductDetails();

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID GROUP BY BRAND_NAME, ID", nativeQuery = true)
	List<Object[]> findProductDetailsGroupByBrand();

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID GROUP BY COLOR, ID", nativeQuery = true)
	List<Object[]> findProductDetailsGroupByColor();

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID GROUP BY PRICE, ID", nativeQuery = true)
	List<Object[]> findProductDetailsGroupByPrice();

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID GROUP BY SELLER, ID", nativeQuery = true)
	List<Object[]> findProductDetailsGroupBySeller();

	@Query(value = "SELECT D.ID AS ID, A.NAME AS PRODUCT_NAME, B.NAME AS BRAND_NAME, D.COLOR, D.PRICE, D.SIZE, D.SELLER  FROM PRODUCT A, BRAND B, PRODUCT_BRAND_MAPPING C, PRODUCT_DETAILS D WHERE A.ID = C.PRODUCT_ID AND B.ID = C.BRAND_ID AND D.PROD_BRAND_MAP_ID = C.ID GROUP BY SIZE, ID", nativeQuery = true)
	List<Object[]> findProductDetailsGroupBySize();

}
