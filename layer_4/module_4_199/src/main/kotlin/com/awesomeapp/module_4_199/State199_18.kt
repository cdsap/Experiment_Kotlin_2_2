package com.awesomeapp.module_4_199

sealed class State199_18 {
    data object Loading : State199_18()
    data class Success(val data: String) : State199_18()
    data class Error(val message: String) : State199_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}