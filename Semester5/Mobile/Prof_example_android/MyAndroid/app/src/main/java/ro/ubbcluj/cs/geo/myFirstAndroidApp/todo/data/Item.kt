package ro.ubbcluj.cs.geo.myFirstAndroidApp.todo.dataimport androidx.room.ColumnInfoimport androidx.room.Entityimport androidx.room.PrimaryKey@Entity(tableName = "items")data class Item(    @PrimaryKey @ColumnInfo(name = "_id") var _id: String,    @ColumnInfo(name="productName") var productname: String,    @ColumnInfo(name="price") var price: Int) {    override fun toString(): String = "$productname | $price"}