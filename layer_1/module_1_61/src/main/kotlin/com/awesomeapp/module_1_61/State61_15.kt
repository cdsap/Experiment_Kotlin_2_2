package com.awesomeapp.module_1_61

sealed class State61_15 {
    data object Loading : State61_15()
    data class Success(val data: String) : State61_15()
    data class Error(val message: String) : State61_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}