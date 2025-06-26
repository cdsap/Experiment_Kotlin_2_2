package com.awesomeapp.module_3_153

sealed class State153_13 {
    data object Loading : State153_13()
    data class Success(val data: String) : State153_13()
    data class Error(val message: String) : State153_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}