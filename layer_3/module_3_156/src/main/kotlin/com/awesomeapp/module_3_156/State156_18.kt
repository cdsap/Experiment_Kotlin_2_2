package com.awesomeapp.module_3_156

sealed class State156_18 {
    data object Loading : State156_18()
    data class Success(val data: String) : State156_18()
    data class Error(val message: String) : State156_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}