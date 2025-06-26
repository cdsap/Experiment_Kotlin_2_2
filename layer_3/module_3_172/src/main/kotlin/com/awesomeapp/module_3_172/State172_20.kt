package com.awesomeapp.module_3_172

sealed class State172_20 {
    data object Loading : State172_20()
    data class Success(val data: String) : State172_20()
    data class Error(val message: String) : State172_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}