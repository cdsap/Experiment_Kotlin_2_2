package com.awesomeapp.module_4_195

sealed class State195_18 {
    data object Loading : State195_18()
    data class Success(val data: String) : State195_18()
    data class Error(val message: String) : State195_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}