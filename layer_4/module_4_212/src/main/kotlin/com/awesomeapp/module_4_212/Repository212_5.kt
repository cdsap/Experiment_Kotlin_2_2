package com.awesomeapp.module_4_212

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_184.Api184_6
import com.awesomeapp.module_3_164.Api164_6
import com.awesomeapp.module_3_180.Api180_6
import com.awesomeapp.module_3_160.Api160_6
import com.awesomeapp.module_3_176.Api176_6
import com.awesomeapp.module_3_156.Api156_6


@Singleton
class Repository212_5 @Inject constructor(
    private val api0: Api184_6,
    private val api1: Api164_6,
    private val api2: Api180_6,
    private val api3: Api160_6,
    private val api4: Api176_6,
    private val api5: Api156_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}