package com.awesomeapp.module_1_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_8.Api8_6


@Singleton
class Repository76_5 @Inject constructor(
    private val api0: Api32_6,
    private val api1: Api4_6,
    private val api2: Api20_6,
    private val api3: Api12_6,
    private val api4: Api24_6,
    private val api5: Api8_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}