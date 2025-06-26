package com.awesomeapp.module_2_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_88.Api88_6


@Singleton
class Repository104_5 @Inject constructor(
    private val api0: Api92_6,
    private val api1: Api88_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}