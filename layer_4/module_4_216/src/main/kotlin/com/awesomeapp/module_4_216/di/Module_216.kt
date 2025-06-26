package com.awesomeapp.module_4_216.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_216.Viewmodel216_1
import com.awesomeapp.module_4_216.Activity216_2
import com.awesomeapp.module_4_216.Activity216_3
import com.awesomeapp.module_4_216.Fragment216_4
import com.awesomeapp.module_4_216.Repository216_5
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_144.Api144_6
import com.awesomeapp.module_3_172.Api172_6
import com.awesomeapp.module_3_168.Api168_6
import com.awesomeapp.module_4_216.Api216_6
import com.awesomeapp.module_4_216.Usecase216_7
import com.awesomeapp.module_4_216.Model216_9
import com.awesomeapp.module_4_216.Model216_10
import com.awesomeapp.module_4_216.Activity216_11
import com.awesomeapp.module_4_216.Model216_13
import com.awesomeapp.module_4_216.Activity216_14
import com.awesomeapp.module_4_216.Model216_16
import com.awesomeapp.module_4_216.Activity216_17
import com.awesomeapp.module_4_216.Model216_19
import com.awesomeapp.module_4_216.Activity216_20

@Module
@InstallIn(SingletonComponent::class)
object Module_216 {
    @Provides
    @Singleton
    fun provideRepository216_5(
        api0: Api156_6 = Api156_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api172_6 = Api172_6(),
        api3: Api168_6 = Api168_6()
    ): Repository216_5 {
        return Repository216_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi216_6(): Api216_6 {
        return Api216_6()
    }
}