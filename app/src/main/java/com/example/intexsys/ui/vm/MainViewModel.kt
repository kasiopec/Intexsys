package com.example.intexsys.ui.vm

import androidx.lifecycle.ViewModel
import com.example.intexsys.model.SimplifiedProduct
import com.example.intexsys.network.model.Category
import com.example.intexsys.network.model.Element
import com.example.intexsys.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    val categoriesFlow: Flow<List<Category>> = flow {
        val categories = mainRepository.getCategories()
        emit(categories)
    }

    fun productsFlow(url: String): Flow<List<Element>> = flow {
        val products = mainRepository.getProducts(url)
        emit(products)
    }

    fun getProductInfo(element: Element, url: String) : SimplifiedProduct {
        return mainRepository.getProductInfo(element, url)
    }

}