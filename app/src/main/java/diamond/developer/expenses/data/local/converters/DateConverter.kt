package diamond.developer.expenses.data.local.converters

import androidx.room.TypeConverter
import java.util.Date

open class DateConverter {
    @TypeConverter
    fun toDate(dateLong: Long?): Date?{
        return dateLong?.let { Date(it) }
    }

    @TypeConverter
    fun fromDate(date: Date?): Long?{
        return date?.time
    }
}