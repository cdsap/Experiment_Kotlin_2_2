package com.awesomeapp.module_1_67

sealed class State67_12 {
    data object Loading : State67_12()
    data class Success(val data: String) : State67_12()
    data class Error(val message: String) : State67_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}