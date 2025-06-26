package com.awesomeapp.module_2_112.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_112.Viewmodel112_1
import com.awesomeapp.module_2_112.Activity112_2
import com.awesomeapp.module_2_112.Activity112_3
import com.awesomeapp.module_2_112.Fragment112_4
import com.awesomeapp.module_2_112.Repository112_5
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_112.Model112_8
import com.awesomeapp.module_2_112.Model112_9
import com.awesomeapp.module_2_112.Activity112_10
import com.awesomeapp.module_2_112.Model112_12
import com.awesomeapp.module_2_112.Activity112_13
import com.awesomeapp.module_2_112.Model112_15
import com.awesomeapp.module_2_112.Activity112_16
import com.awesomeapp.module_2_112.Model112_18
import com.awesomeapp.module_2_112.Activity112_19

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(
        api0: Api60_6 = Api60_6(),
        api1: Api84_6 = Api84_6(),
        api2: Api56_6 = Api56_6()
    ): Repository112_5 {
        return Repository112_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}