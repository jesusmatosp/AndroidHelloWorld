package pe.edu.sise.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    protected EditText edit_nombre;
    protected Button btn_enviar;
    protected RadioButton rd_button_software;
    protected RadioButton rd_button_redes;
    protected RadioGroup rg_carrera;
    protected TextView lbl_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_nombre = (EditText) findViewById(R.id.editName);
        btn_enviar = (Button) findViewById(R.id.btn_enviar);
        rd_button_redes = (RadioButton) findViewById(R.id.redes_comunicacion);
        rd_button_software = (RadioButton) findViewById(R.id.rb_software_sistemas);
        lbl_resultado = (TextView) findViewById(R.id.lbl_resultado);
        rg_carrera = (RadioGroup) findViewById(R.id.rbg_carreras);
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String greeting = "Hola %s, Bienvenido al mundo Android con Java: %s";
                String message = "";
                if(rd_button_software.isChecked()){
                    message = "Usted es demasiado Cool!";
                }else if(rd_button_redes.isChecked()){
                    message = "Vaya! ... bueno... bien por usted!";
                }else{
                    message = "Que hace por acá!?";
                }
                String output = String.format(greeting, edit_nombre.getText().toString(), message);
                lbl_resultado.setText(output);
            }
        });




    }
}
