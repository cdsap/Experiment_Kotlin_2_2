package com.awesomeapp.module_1_60

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_4.Api4_6


@Singleton
class Repository60_5 @Inject constructor(
    private val api0: Api4_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}