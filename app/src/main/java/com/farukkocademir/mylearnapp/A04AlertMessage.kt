package com.farukkocademir.mylearnapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farukkocademir.mylearnapp.databinding.ActivityA01PersonBinding
import com.farukkocademir.mylearnapp.databinding.ActivityA04AlertMessageBinding

class A04AlertMessage : AppCompatActivity() {

    private lateinit var  binding : ActivityA04AlertMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityA04AlertMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    // Üç farklı mesaj gösterme yöntemi vardır
    // 1. Toast Mesajı
    // 2. AlertDialog Mesajı
    // 3. Snackbar Mesajı

    // Context nedir? : Uygulamanın nerede çalıştığı takip etmek için kullanılır.
    // Context uygulamanın hangi aktivitede olduğunu gösterir.
    // Activity Context => this : Genelde activity context kullanılır.
    // Application Context : Uygulamanın kendisini gösterir.

    fun ShowToastMesssage(view : View){
        Toast.makeText(this,"Button Tıklandı", Toast.LENGTH_LONG).show()
        //Toast.makeText(this,"Button Tıklandı", Toast.LENGTH_LONG).show()
    }
    fun ShowAlertDialog(view : View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Başlık")
        alert.setMessage("Mesaj")
        alert.setPositiveButton("Tamam"){dialog, which ->
            Toast.makeText(this,"Tamam seçildi",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("İptal"){dialog, which ->
            Toast.makeText(this,"İptal seçildi",Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}