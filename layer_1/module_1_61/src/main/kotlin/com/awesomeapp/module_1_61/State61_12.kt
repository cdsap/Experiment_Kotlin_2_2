package com.awesomeapp.module_1_61

sealed class State61_12 {
    data object Loading : State61_12()
    data class Success(val data: String) : State61_12()
    data class Error(val message: String) : State61_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}