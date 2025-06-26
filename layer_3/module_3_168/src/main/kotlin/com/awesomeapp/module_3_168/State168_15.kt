package com.awesomeapp.module_3_168

sealed class State168_15 {
    data object Loading : State168_15()
    data class Success(val data: String) : State168_15()
    data class Error(val message: String) : State168_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}