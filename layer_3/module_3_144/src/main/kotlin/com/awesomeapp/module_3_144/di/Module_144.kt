package com.awesomeapp.module_3_144.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_144.Viewmodel144_1
import com.awesomeapp.module_3_144.Activity144_2
import com.awesomeapp.module_3_144.Activity144_3
import com.awesomeapp.module_3_144.Fragment144_4
import com.awesomeapp.module_3_144.Repository144_5
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_104.Api104_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_3_144.Api144_6
import com.awesomeapp.module_3_144.Usecase144_7
import com.awesomeapp.module_3_144.Model144_9
import com.awesomeapp.module_3_144.Model144_10
import com.awesomeapp.module_3_144.Activity144_11
import com.awesomeapp.module_3_144.Model144_13
import com.awesomeapp.module_3_144.Activity144_14
import com.awesomeapp.module_3_144.Model144_16
import com.awesomeapp.module_3_144.Activity144_17
import com.awesomeapp.module_3_144.Model144_19
import com.awesomeapp.module_3_144.Activity144_20

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api96_6 = Api96_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api104_6 = Api104_6(),
        api4: Api132_6 = Api132_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}