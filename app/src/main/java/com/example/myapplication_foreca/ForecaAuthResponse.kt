package com.example.myapplication_foreca

import com.google.gson.annotations.SerializedName

class ForecaAuthResponse(@SerializedName("token_name") val token: ForecaAuthRequest) {
}