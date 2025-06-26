package com.awesomeapp.module_2_96.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_96.Viewmodel96_1
import com.awesomeapp.module_2_96.Activity96_2
import com.awesomeapp.module_2_96.Activity96_3
import com.awesomeapp.module_2_96.Fragment96_4
import com.awesomeapp.module_2_96.Repository96_5
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_96.Usecase96_7
import com.awesomeapp.module_2_96.Model96_9
import com.awesomeapp.module_2_96.Model96_10
import com.awesomeapp.module_2_96.Activity96_11
import com.awesomeapp.module_2_96.Model96_13
import com.awesomeapp.module_2_96.Activity96_14
import com.awesomeapp.module_2_96.Model96_16
import com.awesomeapp.module_2_96.Activity96_17
import com.awesomeapp.module_2_96.Model96_19
import com.awesomeapp.module_2_96.Activity96_20

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api52_6 = Api52_6(),
        api1: Api48_6 = Api48_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api88_6 = Api88_6(),
        api6: Api72_6 = Api72_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}