package com.awesomeapp.module_3_148.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_148.Viewmodel148_1
import com.awesomeapp.module_3_148.Activity148_2
import com.awesomeapp.module_3_148.Activity148_3
import com.awesomeapp.module_3_148.Fragment148_4
import com.awesomeapp.module_3_148.Repository148_5
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_3_148.Api148_6
import com.awesomeapp.module_3_148.Model148_8
import com.awesomeapp.module_3_148.Model148_9
import com.awesomeapp.module_3_148.Activity148_10
import com.awesomeapp.module_3_148.Model148_12
import com.awesomeapp.module_3_148.Activity148_13
import com.awesomeapp.module_3_148.Model148_15
import com.awesomeapp.module_3_148.Activity148_16
import com.awesomeapp.module_3_148.Model148_18
import com.awesomeapp.module_3_148.Activity148_19

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api108_6 = Api108_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api120_6 = Api120_6(),
        api3: Api116_6 = Api116_6(),
        api4: Api136_6 = Api136_6(),
        api5: Api132_6 = Api132_6(),
        api6: Api104_6 = Api104_6(),
        api7: Api112_6 = Api112_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}