package com.awesomeapp.module_3_140.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_140.Viewmodel140_1
import com.awesomeapp.module_3_140.Activity140_2
import com.awesomeapp.module_3_140.Activity140_3
import com.awesomeapp.module_3_140.Fragment140_4
import com.awesomeapp.module_3_140.Repository140_5
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_3_140.Api140_6
import com.awesomeapp.module_3_140.Service140_7
import com.awesomeapp.module_3_140.Worker140_8
import com.awesomeapp.module_3_140.Model140_10
import com.awesomeapp.module_3_140.Model140_11
import com.awesomeapp.module_3_140.Activity140_12
import com.awesomeapp.module_3_140.Model140_14
import com.awesomeapp.module_3_140.Activity140_15
import com.awesomeapp.module_3_140.Model140_17
import com.awesomeapp.module_3_140.Activity140_18
import com.awesomeapp.module_3_140.Model140_20

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api136_6 = Api136_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api100_6 = Api100_6(),
        api3: Api108_6 = Api108_6(),
        api4: Api124_6 = Api124_6(),
        api5: Api128_6 = Api128_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}