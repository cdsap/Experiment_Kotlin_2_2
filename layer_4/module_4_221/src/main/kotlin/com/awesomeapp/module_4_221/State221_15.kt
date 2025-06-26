package com.awesomeapp.module_4_221

sealed class State221_15 {
    data object Loading : State221_15()
    data class Success(val data: String) : State221_15()
    data class Error(val message: String) : State221_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}