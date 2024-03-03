package io.chthonic.rickmortychars.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import io.chthonic.rickmortychars.data.database.models.CharacterInfoDb

private const val CURRENT_DATABASE_VERSION = 1

@Database(
    entities = [
        CharacterInfoDb::class,
    ],
    version = CURRENT_DATABASE_VERSION
)
abstract class RickMortyDatabase : RoomDatabase() {
    abstract fun charactersDao(): CharactersDao
}