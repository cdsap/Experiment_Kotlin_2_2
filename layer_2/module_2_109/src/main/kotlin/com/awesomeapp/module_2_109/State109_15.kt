package com.awesomeapp.module_2_109

sealed class State109_15 {
    data object Loading : State109_15()
    data class Success(val data: String) : State109_15()
    data class Error(val message: String) : State109_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}