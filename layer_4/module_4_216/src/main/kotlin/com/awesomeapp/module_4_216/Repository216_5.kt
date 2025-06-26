package com.awesomeapp.module_4_216

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_144.Api144_6
import com.awesomeapp.module_3_172.Api172_6
import com.awesomeapp.module_3_168.Api168_6


@Singleton
class Repository216_5 @Inject constructor(
    private val api0: Api156_6,
    private val api1: Api144_6,
    private val api2: Api172_6,
    private val api3: Api168_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}