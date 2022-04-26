package com.co.mercapp.data.products

import com.co.mercapp.data.products.datasource.remote.RemoteProductsDataSource
import com.co.mercapp.domain.base.Result
import com.co.mercapp.domain.products.entity.ProductEntity
import com.co.mercapp.domain.products.repository.ProductsRepository
import com.co.mercapp.domain.products.usecase.SearchProductsByNameUseCase.SearchProductsParams
import javax.inject.Inject

class DefaultProductsRepository @Inject constructor(private val remoteDataSource: RemoteProductsDataSource) :
    ProductsRepository {
    override suspend fun searchByName(params: SearchProductsParams): Result<List<ProductEntity>> =
        remoteDataSource.searchByName(params)
}