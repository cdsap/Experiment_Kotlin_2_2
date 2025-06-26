package com.awesomeapp.module_4_222

sealed class State222_19 {
    data object Loading : State222_19()
    data class Success(val data: String) : State222_19()
    data class Error(val message: String) : State222_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}