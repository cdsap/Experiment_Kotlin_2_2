package com.awesomeapp.module_4_228

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.module_3_148.Api148_6


@Singleton
class Repository228_5 @Inject constructor(
    private val api0: Api148_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}