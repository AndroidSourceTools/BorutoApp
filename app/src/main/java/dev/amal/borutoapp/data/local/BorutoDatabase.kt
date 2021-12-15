package dev.amal.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.amal.borutoapp.data.local.dao.HeroDao
import dev.amal.borutoapp.data.local.dao.HeroRemoteKeyDao
import dev.amal.borutoapp.domain.model.Hero
import dev.amal.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}