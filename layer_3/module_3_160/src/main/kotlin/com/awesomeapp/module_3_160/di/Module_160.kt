package com.awesomeapp.module_3_160.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_160.Viewmodel160_1
import com.awesomeapp.module_3_160.Activity160_2
import com.awesomeapp.module_3_160.Activity160_3
import com.awesomeapp.module_3_160.Fragment160_4
import com.awesomeapp.module_3_160.Repository160_5
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_3_160.Api160_6
import com.awesomeapp.module_3_160.Service160_7
import com.awesomeapp.module_3_160.Worker160_8
import com.awesomeapp.module_3_160.Model160_10
import com.awesomeapp.module_3_160.Model160_11
import com.awesomeapp.module_3_160.Activity160_12
import com.awesomeapp.module_3_160.Model160_14
import com.awesomeapp.module_3_160.Activity160_15
import com.awesomeapp.module_3_160.Model160_17
import com.awesomeapp.module_3_160.Activity160_18
import com.awesomeapp.module_3_160.Model160_20

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api112_6 = Api112_6(),
        api1: Api104_6 = Api104_6(),
        api2: Api136_6 = Api136_6(),
        api3: Api116_6 = Api116_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}