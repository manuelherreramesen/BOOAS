package com.example.kotlin.booas.common

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import java.io.Serializable
import java.util.ArrayList
import java.util.function.Consumer

@Service
abstract class GenericServiceImpl<T, ID : Serializable?> : GenericServiceApi<T, ID> {
    abstract val myDao: CrudRepository<T, ID>

    override fun save(entity: T): T {
        return myDao.save(entity)
    }

    override fun delete(id: ID) {
        myDao.deleteById(id)
    }

    override fun get(id: ID): T? {
        val obj = myDao.findById(id)
        return if (obj.isPresent) {
            obj.get()
        } else null
    }

    override val all: MutableList<T>
        get() {
            val returnList: MutableList<T> = ArrayList()
            myDao.findAll().forEach(Consumer { obj: T -> returnList.add(obj) })
            return returnList
        }

}