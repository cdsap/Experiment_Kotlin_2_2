package com.awesomeapp.module_3_172

sealed class State172_14 {
    data object Loading : State172_14()
    data class Success(val data: String) : State172_14()
    data class Error(val message: String) : State172_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}