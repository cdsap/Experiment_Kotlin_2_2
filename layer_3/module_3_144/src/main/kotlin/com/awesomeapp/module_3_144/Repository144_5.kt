package com.awesomeapp.module_3_144

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_132.Api132_6


@Singleton
class Repository144_5 @Inject constructor(
    private val api0: Api96_6,
    private val api1: Api100_6,
    private val api2: Api124_6,
    private val api3: Api104_6,
    private val api4: Api132_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData()
    }
}