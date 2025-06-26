package com.awesomeapp.module_3_156

sealed class State156_15 {
    data object Loading : State156_15()
    data class Success(val data: String) : State156_15()
    data class Error(val message: String) : State156_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}