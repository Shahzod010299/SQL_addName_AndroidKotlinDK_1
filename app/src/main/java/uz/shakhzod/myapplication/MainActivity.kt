package uz.shakhzod.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddToDb.setOnClickListener {
            val dbHandler = OpenHelper(this, null)
            val user = Name(etName.text.toString())
            dbHandler.addName(user)
            Toast.makeText(this, etName.text.toString() + "Added to database", Toast.LENGTH_LONG).show()
        }
        btnAddToDb.setOnClickListener {
            val dbHandler = OpenHelper(this, null)
            val user = Name(etName.text.toString())
            dbHandler.addName(user)
            Toast.makeText(this, etName.text.toString() + "Added to database", Toast.LENGTH_LONG).show()
        }
        btnShowDatafromDb.setOnClickListener {
            tvDisplayName.text = ""
            val dbHandler = OpenHelper(this, null)
            val cursor = dbHandler.getAllName()
            cursor!!.moveToFirst()
            tvDisplayName.append((cursor.getString(cursor.getColumnIndex(OpenHelper.COLUMN_NAME))))
            while (cursor.moveToNext()) {
                tvDisplayName.append((cursor.getString(cursor.getColumnIndex(OpenHelper.COLUMN_NAME))))
                tvDisplayName.append("\n")
            }
            cursor.close()
        }

    }
}