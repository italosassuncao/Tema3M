package com.example.tema3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.example.tema3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnTestar.setOnClickListener {
            if (binding.ckCambioAutomatico.isChecked) {
                Toast.makeText(this@MainActivity, "Carro com câmbio Automático", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Carro com câmbio Manual", Toast.LENGTH_SHORT).show()
            }

            when (binding.rgbEstadoCivil.checkedRadioButtonId) {
                R.id.rbSolteiro -> Toast.makeText(this@MainActivity, "Solteiro Selecionado", Toast.LENGTH_SHORT).show()
                R.id.rbCasado -> Toast.makeText(this@MainActivity, "Casado Selecionado", Toast.LENGTH_SHORT).show()
                R.id.rbSeparado -> Toast.makeText(this@MainActivity, "Separado Selecionado", Toast.LENGTH_SHORT).show()
                R.id.rbDivorciado -> Toast.makeText(this@MainActivity, "Divorciado Selecionado",
                    Toast.LENGTH_SHORT).show()
                R.id.rbViuvo -> Toast.makeText(this@MainActivity, "Viuvo Selecionado", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.getItemId()) {
            R.id.action_search -> {
                Toast.makeText(this, "Você clicou na opção para Pesquisar.", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_setting -> {
                Toast.makeText(this, "Você clicou na opção para Configurar.", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_Profile -> {
                Toast.makeText(this,"Você clicou na opção para ver seu Perfil.",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_AulaTemas -> {
                Toast.makeText(this,"Você clicou na opção para ver a Aula de Temas.",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}