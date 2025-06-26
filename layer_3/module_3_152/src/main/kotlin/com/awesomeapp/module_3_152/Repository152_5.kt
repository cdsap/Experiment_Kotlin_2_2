package com.awesomeapp.module_3_152

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_116.Api116_6


@Singleton
class Repository152_5 @Inject constructor(
    private val api0: Api96_6,
    private val api1: Api112_6,
    private val api2: Api108_6,
    private val api3: Api116_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData() + api3.fetchData()
    }
}