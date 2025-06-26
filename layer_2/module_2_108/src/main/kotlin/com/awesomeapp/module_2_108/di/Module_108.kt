package com.awesomeapp.module_2_108.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_108.Viewmodel108_1
import com.awesomeapp.module_2_108.Activity108_2
import com.awesomeapp.module_2_108.Activity108_3
import com.awesomeapp.module_2_108.Fragment108_4
import com.awesomeapp.module_2_108.Repository108_5
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_108.Usecase108_7
import com.awesomeapp.module_2_108.Model108_9
import com.awesomeapp.module_2_108.Model108_10
import com.awesomeapp.module_2_108.Activity108_11
import com.awesomeapp.module_2_108.Model108_13
import com.awesomeapp.module_2_108.Activity108_14
import com.awesomeapp.module_2_108.Model108_16
import com.awesomeapp.module_2_108.Activity108_17
import com.awesomeapp.module_2_108.Model108_19
import com.awesomeapp.module_2_108.Activity108_20

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(
        api0: Api68_6 = Api68_6(),
        api1: Api92_6 = Api92_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api56_6 = Api56_6(),
        api4: Api52_6 = Api52_6(),
        api5: Api64_6 = Api64_6(),
        api6: Api80_6 = Api80_6()
    ): Repository108_5 {
        return Repository108_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}