package com.awesomeapp.module_2_112

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_56.Api56_6


@Singleton
class Repository112_5 @Inject constructor(
    private val api0: Api60_6,
    private val api1: Api84_6,
    private val api2: Api56_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}