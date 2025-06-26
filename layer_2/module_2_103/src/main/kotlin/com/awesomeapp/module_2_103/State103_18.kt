package com.awesomeapp.module_2_103

sealed class State103_18 {
    data object Loading : State103_18()
    data class Success(val data: String) : State103_18()
    data class Error(val message: String) : State103_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}