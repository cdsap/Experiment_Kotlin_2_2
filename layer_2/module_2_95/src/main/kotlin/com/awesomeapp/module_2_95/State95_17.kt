package com.awesomeapp.module_2_95

sealed class State95_17 {
    data object Loading : State95_17()
    data class Success(val data: String) : State95_17()
    data class Error(val message: String) : State95_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}