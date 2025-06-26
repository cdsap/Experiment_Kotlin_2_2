package com.awesomeapp.module_1_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_40.Api40_6


@Singleton
class Repository88_5 @Inject constructor(
    private val api0: Api16_6,
    private val api1: Api32_6,
    private val api2: Api28_6,
    private val api3: Api40_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}