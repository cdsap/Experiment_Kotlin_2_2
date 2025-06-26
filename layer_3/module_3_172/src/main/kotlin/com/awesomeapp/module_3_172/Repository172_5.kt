package com.awesomeapp.module_3_172

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_104.Api104_6


@Singleton
class Repository172_5 @Inject constructor(
    private val api0: Api120_6,
    private val api1: Api108_6,
    private val api2: Api128_6,
    private val api3: Api132_6,
    private val api4: Api124_6,
    private val api5: Api104_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData()
    }
}