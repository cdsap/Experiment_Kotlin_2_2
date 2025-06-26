package com.awesomeapp.module_3_184.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_184.Viewmodel184_1
import com.awesomeapp.module_3_184.Activity184_2
import com.awesomeapp.module_3_184.Activity184_3
import com.awesomeapp.module_3_184.Fragment184_4
import com.awesomeapp.module_3_184.Repository184_5
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_3_184.Api184_6
import com.awesomeapp.module_3_184.Model184_8
import com.awesomeapp.module_3_184.Model184_9
import com.awesomeapp.module_3_184.Activity184_10
import com.awesomeapp.module_3_184.Model184_12
import com.awesomeapp.module_3_184.Activity184_13
import com.awesomeapp.module_3_184.Model184_15
import com.awesomeapp.module_3_184.Activity184_16
import com.awesomeapp.module_3_184.Model184_18
import com.awesomeapp.module_3_184.Activity184_19

@Module
@InstallIn(SingletonComponent::class)
object Module_184 {
    @Provides
    @Singleton
    fun provideRepository184_5(
        api0: Api108_6 = Api108_6(),
        api1: Api124_6 = Api124_6()
    ): Repository184_5 {
        return Repository184_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi184_6(): Api184_6 {
        return Api184_6()
    }
}