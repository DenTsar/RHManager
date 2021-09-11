package com.example.rhmanager.repository

interface BaseRepository{

}

class TestRepository : BaseRepository {
    fun getTest(): String = "hi!"
}