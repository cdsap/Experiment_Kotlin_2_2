package com.awesomeapp.module_2_124.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_124.Viewmodel124_1
import com.awesomeapp.module_2_124.Activity124_2
import com.awesomeapp.module_2_124.Activity124_3
import com.awesomeapp.module_2_124.Fragment124_4
import com.awesomeapp.module_2_124.Repository124_5
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_124.Model124_8
import com.awesomeapp.module_2_124.Model124_9
import com.awesomeapp.module_2_124.Activity124_10
import com.awesomeapp.module_2_124.Model124_12
import com.awesomeapp.module_2_124.Activity124_13
import com.awesomeapp.module_2_124.Model124_15
import com.awesomeapp.module_2_124.Activity124_16
import com.awesomeapp.module_2_124.Model124_18
import com.awesomeapp.module_2_124.Activity124_19

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api76_6 = Api76_6(),
        api1: Api68_6 = Api68_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api80_6 = Api80_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api72_6 = Api72_6(),
        api6: Api56_6 = Api56_6()
    ): Repository124_5 {
        return Repository124_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}