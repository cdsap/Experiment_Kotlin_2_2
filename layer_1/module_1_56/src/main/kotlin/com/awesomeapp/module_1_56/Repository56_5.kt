package com.awesomeapp.module_1_56

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_0_20.Api20_6


@Singleton
class Repository56_5 @Inject constructor(
    private val api0: Api20_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}