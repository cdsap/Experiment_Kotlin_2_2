package com.awesomeapp.module_3_147

sealed class State147_19 {
    data object Loading : State147_19()
    data class Success(val data: String) : State147_19()
    data class Error(val message: String) : State147_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}