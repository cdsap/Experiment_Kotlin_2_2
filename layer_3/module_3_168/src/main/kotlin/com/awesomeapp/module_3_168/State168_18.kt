package com.awesomeapp.module_3_168

sealed class State168_18 {
    data object Loading : State168_18()
    data class Success(val data: String) : State168_18()
    data class Error(val message: String) : State168_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}