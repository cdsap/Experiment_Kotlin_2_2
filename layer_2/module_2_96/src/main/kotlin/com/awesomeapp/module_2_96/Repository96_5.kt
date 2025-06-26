package com.awesomeapp.module_2_96

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_72.Api72_6


@Singleton
class Repository96_5 @Inject constructor(
    private val api0: Api52_6,
    private val api1: Api48_6,
    private val api2: Api64_6,
    private val api3: Api84_6,
    private val api4: Api60_6,
    private val api5: Api88_6,
    private val api6: Api72_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData() + api4.fetchData() + api5.fetchData() + api6.fetchData()
    }
}