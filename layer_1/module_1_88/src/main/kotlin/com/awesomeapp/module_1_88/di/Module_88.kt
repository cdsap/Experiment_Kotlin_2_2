package com.awesomeapp.module_1_88.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_88.Viewmodel88_1
import com.awesomeapp.module_1_88.Activity88_2
import com.awesomeapp.module_1_88.Activity88_3
import com.awesomeapp.module_1_88.Fragment88_4
import com.awesomeapp.module_1_88.Repository88_5
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_88.Model88_8
import com.awesomeapp.module_1_88.Model88_9
import com.awesomeapp.module_1_88.Activity88_10
import com.awesomeapp.module_1_88.Model88_12
import com.awesomeapp.module_1_88.Activity88_13
import com.awesomeapp.module_1_88.Model88_15
import com.awesomeapp.module_1_88.Activity88_16
import com.awesomeapp.module_1_88.Model88_18
import com.awesomeapp.module_1_88.Activity88_19

@Module
@InstallIn(SingletonComponent::class)
object Module_88 {
    @Provides
    @Singleton
    fun provideRepository88_5(
        api0: Api16_6 = Api16_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api40_6 = Api40_6()
    ): Repository88_5 {
        return Repository88_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi88_6(): Api88_6 {
        return Api88_6()
    }
}