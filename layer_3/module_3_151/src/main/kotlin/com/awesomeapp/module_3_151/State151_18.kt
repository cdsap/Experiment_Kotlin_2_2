package com.awesomeapp.module_3_151

sealed class State151_18 {
    data object Loading : State151_18()
    data class Success(val data: String) : State151_18()
    data class Error(val message: String) : State151_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}