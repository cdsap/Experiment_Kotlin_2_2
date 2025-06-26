package com.awesomeapp.module_4_188.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_188.Viewmodel188_1
import com.awesomeapp.module_4_188.Activity188_2
import com.awesomeapp.module_4_188.Activity188_3
import com.awesomeapp.module_4_188.Fragment188_4
import com.awesomeapp.module_4_188.Repository188_5
import com.awesomeapp.module_3_160.Api160_6
import com.awesomeapp.module_3_184.Api184_6
import com.awesomeapp.module_3_176.Api176_6
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_148.Api148_6
import com.awesomeapp.module_3_144.Api144_6
import com.awesomeapp.module_4_188.Api188_6
import com.awesomeapp.module_4_188.Model188_8
import com.awesomeapp.module_4_188.Model188_9
import com.awesomeapp.module_4_188.Activity188_10
import com.awesomeapp.module_4_188.Model188_12
import com.awesomeapp.module_4_188.Activity188_13
import com.awesomeapp.module_4_188.Model188_15
import com.awesomeapp.module_4_188.Activity188_16
import com.awesomeapp.module_4_188.Model188_18
import com.awesomeapp.module_4_188.Activity188_19

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(
        api0: Api160_6 = Api160_6(),
        api1: Api184_6 = Api184_6(),
        api2: Api176_6 = Api176_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api148_6 = Api148_6(),
        api5: Api144_6 = Api144_6()
    ): Repository188_5 {
        return Repository188_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}