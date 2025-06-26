package com.awesomeapp.module_3_168.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_168.Viewmodel168_1
import com.awesomeapp.module_3_168.Activity168_2
import com.awesomeapp.module_3_168.Activity168_3
import com.awesomeapp.module_3_168.Fragment168_4
import com.awesomeapp.module_3_168.Repository168_5
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_3_168.Api168_6
import com.awesomeapp.module_3_168.Usecase168_7
import com.awesomeapp.module_3_168.Model168_9
import com.awesomeapp.module_3_168.Model168_10
import com.awesomeapp.module_3_168.Activity168_11
import com.awesomeapp.module_3_168.Model168_13
import com.awesomeapp.module_3_168.Activity168_14
import com.awesomeapp.module_3_168.Model168_16
import com.awesomeapp.module_3_168.Activity168_17
import com.awesomeapp.module_3_168.Model168_19
import com.awesomeapp.module_3_168.Activity168_20

@Module
@InstallIn(SingletonComponent::class)
object Module_168 {
    @Provides
    @Singleton
    fun provideRepository168_5(
        api0: Api132_6 = Api132_6(),
        api1: Api124_6 = Api124_6(),
        api2: Api108_6 = Api108_6(),
        api3: Api116_6 = Api116_6()
    ): Repository168_5 {
        return Repository168_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi168_6(): Api168_6 {
        return Api168_6()
    }
}