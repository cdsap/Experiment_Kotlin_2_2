package com.awesomeapp.module_2_104.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_104.Viewmodel104_1
import com.awesomeapp.module_2_104.Activity104_2
import com.awesomeapp.module_2_104.Activity104_3
import com.awesomeapp.module_2_104.Fragment104_4
import com.awesomeapp.module_2_104.Repository104_5
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_104.Model104_8
import com.awesomeapp.module_2_104.Model104_9
import com.awesomeapp.module_2_104.Activity104_10
import com.awesomeapp.module_2_104.Model104_12
import com.awesomeapp.module_2_104.Activity104_13
import com.awesomeapp.module_2_104.Model104_15
import com.awesomeapp.module_2_104.Activity104_16
import com.awesomeapp.module_2_104.Model104_18
import com.awesomeapp.module_2_104.Activity104_19

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api92_6 = Api92_6(),
        api1: Api88_6 = Api88_6()
    ): Repository104_5 {
        return Repository104_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}