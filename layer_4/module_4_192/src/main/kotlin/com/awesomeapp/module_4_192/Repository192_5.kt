package com.awesomeapp.module_4_192

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_148.Api148_6
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_180.Api180_6
import com.awesomeapp.module_3_172.Api172_6
import com.awesomeapp.module_3_168.Api168_6
import com.awesomeapp.module_3_184.Api184_6
import com.awesomeapp.module_3_164.Api164_6
import com.awesomeapp.module_3_176.Api176_6


@Singleton
class Repository192_5 @Inject constructor(
    private val api0: Api148_6,
    private val api1: Api156_6,
    private val api2: Api180_6,
    private val api3: Api172_6,
    private val api4: Api168_6,
    private val api5: Api184_6,
    private val api6: Api164_6,
    private val api7: Api176_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData()
    }
}