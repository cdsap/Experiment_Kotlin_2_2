package com.awesomeapp.module_4_192.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_192.Viewmodel192_1
import com.awesomeapp.module_4_192.Activity192_2
import com.awesomeapp.module_4_192.Activity192_3
import com.awesomeapp.module_4_192.Fragment192_4
import com.awesomeapp.module_4_192.Repository192_5
import com.awesomeapp.module_3_148.Api148_6
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_180.Api180_6
import com.awesomeapp.module_3_172.Api172_6
import com.awesomeapp.module_3_168.Api168_6
import com.awesomeapp.module_3_184.Api184_6
import com.awesomeapp.module_3_164.Api164_6
import com.awesomeapp.module_3_176.Api176_6
import com.awesomeapp.module_4_192.Api192_6
import com.awesomeapp.module_4_192.Usecase192_7
import com.awesomeapp.module_4_192.Model192_9
import com.awesomeapp.module_4_192.Model192_10
import com.awesomeapp.module_4_192.Activity192_11
import com.awesomeapp.module_4_192.Model192_13
import com.awesomeapp.module_4_192.Activity192_14
import com.awesomeapp.module_4_192.Model192_16
import com.awesomeapp.module_4_192.Activity192_17
import com.awesomeapp.module_4_192.Model192_19
import com.awesomeapp.module_4_192.Activity192_20

@Module
@InstallIn(SingletonComponent::class)
object Module_192 {
    @Provides
    @Singleton
    fun provideRepository192_5(
        api0: Api148_6 = Api148_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api180_6 = Api180_6(),
        api3: Api172_6 = Api172_6(),
        api4: Api168_6 = Api168_6(),
        api5: Api184_6 = Api184_6(),
        api6: Api164_6 = Api164_6(),
        api7: Api176_6 = Api176_6()
    ): Repository192_5 {
        return Repository192_5(api0, 
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
    fun provideApi192_6(): Api192_6 {
        return Api192_6()
    }
}