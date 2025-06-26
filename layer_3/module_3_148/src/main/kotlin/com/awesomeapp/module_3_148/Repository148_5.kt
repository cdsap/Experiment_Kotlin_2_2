package com.awesomeapp.module_3_148

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_112.Api112_6


@Singleton
class Repository148_5 @Inject constructor(
    private val api0: Api108_6,
    private val api1: Api100_6,
    private val api2: Api120_6,
    private val api3: Api116_6,
    private val api4: Api136_6,
    private val api5: Api132_6,
    private val api6: Api104_6,
    private val api7: Api112_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}