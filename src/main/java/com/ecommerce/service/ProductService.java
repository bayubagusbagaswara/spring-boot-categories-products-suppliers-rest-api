package com.ecommerce.service;

import com.ecommerce.dto.product.*;
import com.ecommerce.exception.CategoryNotFoundException;
import com.ecommerce.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    ProductResponseDto createProduct(CreateProductRequestDTO createProductRequest) throws CategoryNotFoundException;

    ProductResponseDto getProductById(String id) throws ProductNotFoundException;

    ListProductResponseDto getAllProducts(ListProductRequestDTO listProductRequest);

    ProductResponseDto updateProduct(String id, UpdateProductRequestDto updateProductRequest) throws ProductNotFoundException, CategoryNotFoundException;

    void deleteProduct(String id) throws ProductNotFoundException;

    ProductResponseDto getProductByName(String name) throws ProductNotFoundException;

    List<ProductResponseDto> getProductByContainingName(String name);

    ProductResponseDto getProductBySku(String sku) throws ProductNotFoundException;

    List<ProductResponseDto> getProductByCategoryId(String categoryId);

    List<ProductResponseDto> getProductBySuppliersId(String supplierId);

    // save product to database
}
