package com.awesomeapp.module_4_204

sealed class State204_18 {
    data object Loading : State204_18()
    data class Success(val data: String) : State204_18()
    data class Error(val message: String) : State204_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}