package com.awesomeapp.module_1_68

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_16.Api16_6


@Singleton
class Repository68_5 @Inject constructor(
    private val api0: Api8_6,
    private val api1: Api24_6,
    private val api2: Api4_6,
    private val api3: Api20_6,
    private val api4: Api16_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}