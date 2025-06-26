package com.awesomeapp.module_2_132

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_68.Api68_6


@Singleton
class Repository132_5 @Inject constructor(
    private val api0: Api80_6,
    private val api1: Api84_6,
    private val api2: Api68_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}