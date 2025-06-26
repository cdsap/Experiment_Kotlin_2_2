package com.awesomeapp.module_4_220

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_168.Api168_6
import com.awesomeapp.module_3_140.Api140_6
import com.awesomeapp.module_3_164.Api164_6


@Singleton
class Repository220_5 @Inject constructor(
    private val api0: Api168_6,
    private val api1: Api140_6,
    private val api2: Api164_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}