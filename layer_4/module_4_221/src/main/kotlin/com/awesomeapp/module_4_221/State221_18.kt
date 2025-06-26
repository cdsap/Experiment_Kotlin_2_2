package com.awesomeapp.module_4_221

sealed class State221_18 {
    data object Loading : State221_18()
    data class Success(val data: String) : State221_18()
    data class Error(val message: String) : State221_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}