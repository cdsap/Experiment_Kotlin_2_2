package com.awesomeapp.module_3_184

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_124.Api124_6


@Singleton
class Repository184_5 @Inject constructor(
    private val api0: Api108_6,
    private val api1: Api124_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}