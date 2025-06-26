package com.awesomeapp.module_2_94

sealed class State94_18 {
    data object Loading : State94_18()
    data class Success(val data: String) : State94_18()
    data class Error(val message: String) : State94_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}