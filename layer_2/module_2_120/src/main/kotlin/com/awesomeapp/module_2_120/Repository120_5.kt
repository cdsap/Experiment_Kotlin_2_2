package com.awesomeapp.module_2_120

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_1_80.Api80_6


@Singleton
class Repository120_5 @Inject constructor(
    private val api0: Api92_6,
    private val api1: Api72_6,
    private val api2: Api68_6,
    private val api3: Api52_6,
    private val api4: Api84_6,
    private val api5: Api64_6,
    private val api6: Api76_6,
    private val api7: Api56_6,
    private val api8: Api80_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData() + api7.fetchData() + api8.fetchData()
    }
}