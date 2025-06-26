package com.awesomeapp.module_3_172.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_172.Viewmodel172_1
import com.awesomeapp.module_3_172.Activity172_2
import com.awesomeapp.module_3_172.Activity172_3
import com.awesomeapp.module_3_172.Fragment172_4
import com.awesomeapp.module_3_172.Repository172_5
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_3_172.Api172_6
import com.awesomeapp.module_3_172.Model172_8
import com.awesomeapp.module_3_172.Model172_9
import com.awesomeapp.module_3_172.Activity172_10
import com.awesomeapp.module_3_172.Model172_12
import com.awesomeapp.module_3_172.Activity172_13
import com.awesomeapp.module_3_172.Model172_15
import com.awesomeapp.module_3_172.Activity172_16
import com.awesomeapp.module_3_172.Model172_18
import com.awesomeapp.module_3_172.Activity172_19

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api120_6 = Api120_6(),
        api1: Api108_6 = Api108_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api132_6 = Api132_6(),
        api4: Api124_6 = Api124_6(),
        api5: Api104_6 = Api104_6()
    ): Repository172_5 {
        return Repository172_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}