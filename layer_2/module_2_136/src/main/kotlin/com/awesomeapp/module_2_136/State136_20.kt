package com.awesomeapp.module_2_136

sealed class State136_20 {
    data object Loading : State136_20()
    data class Success(val data: String) : State136_20()
    data class Error(val message: String) : State136_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}