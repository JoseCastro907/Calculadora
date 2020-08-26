package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText text;
    private EditText result;
    private String temp;
    private String operador = "";
    private String valor;
    private boolean punto=false;
    private float resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.editTextTextResult);
        text = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    public void onClick(View view){

        valor = text.getText().toString();

        switch (view.getId()){

            case R.id.uno:
                if(valor.isEmpty()) {
                    text.setText("1");
                }else{
                    text.setText(valor+"1");
                }
                break;
            case R.id.dos:
                if(valor.isEmpty()) {
                    text.setText("2");
                }else{
                    text.setText(valor+"2");
                }
                break;
            case R.id.tres:
                if(valor.isEmpty()) {
                    text.setText("3");
                }else{
                    text.setText(valor+"3");
                }
                break;
            case R.id.cuatro:
                if(valor.isEmpty()) {
                    text.setText("4");
                }else{
                    text.setText(valor+"4");
                }
                break;
            case R.id.cinco:
                if(valor.isEmpty()) {
                    text.setText("5");
                }else{
                    text.setText(valor+"5");
                }
                break;
            case R.id.seis:
                if(valor.isEmpty()) {
                    text.setText("6");
                }else{
                    text.setText(valor+"6");
                }
                break;
            case R.id.siete:
                if(valor.isEmpty()) {
                    text.setText("7");
                }else{
                    text.setText(valor+"7");
                }
                break;
            case R.id.ocho:
                if(valor.isEmpty()) {
                    text.setText("8");
                }else{
                    text.setText(valor+"8");
                }
                break;
            case R.id.nueve:
                if(valor.isEmpty()) {
                    text.setText("9");
                }else{
                    text.setText(valor+"9");
                }
                break;
            case R.id.cero:
                if(valor.isEmpty()) {
                    text.setText("0");
                }else{
                    text.setText(valor+"0");
                }
                break;
            case R.id.punto:
                if(!valor.isEmpty() && !punto) {
                    text.setText(valor+".");
                    punto=true;
                }
                break;
            case R.id.suma:
                if(!valor.isEmpty()&& operador.isEmpty()) {
                    temp = valor;
                    operador="+";
                    text.setText("");
                    result.setText(temp+operador);
                    punto=false;
                }
                break;
            case R.id.resta:
                if(!valor.isEmpty() && operador.isEmpty()) {
                    temp = valor;
                    operador="-";
                    text.setText("");
                    result.setText(temp+operador);
                    punto=false;
                }
                break;
            case R.id.multiplicar:
                if(!valor.isEmpty() && operador.isEmpty()) {
                    temp = valor;
                    operador="*";
                    text.setText("");
                    result.setText(temp+operador);
                    punto=false;
                }
                break;
            case R.id.division:
                if(!valor.isEmpty() && operador.isEmpty()) {
                    temp = valor;
                    operador="/";
                    text.setText("");
                    result.setText(temp+operador);
                    punto=false;
                }
                break;
            case R.id.igual:
                if(!valor.isEmpty() && temp!="") {
                    result.setText(""+temp+operador+valor+" = "+resultado());
                    temp = "";
                    valor="";
                    operador="";
                    punto=false;
                    text.setText("");
                }
                break;
            case R.id.borrar:
                if(!valor.isEmpty()) {
                    String borrar = text.getText().toString();
                    borrar = borrar.substring(0, borrar.length() - 1);
                    text.setText(borrar);
                }else{
                    temp = "";
                    valor = "";
                    operador = "";
                    punto=false;
                    result.setText("");
                }
                break;

            default:
                break;
        }
    }

    private float resultado() {

        float valor1= Float.parseFloat(temp) ;
        float valor2= Float.parseFloat(valor);

        if(operador.equals("+")){
            resultado= valor1+valor2;
        }else if(operador.equals("-")){
            resultado= valor1-valor2;
        }else if(operador.equals("*")){
            resultado= valor1*valor2;
        }else if(operador.equals("/")){
            resultado= valor1/valor2;
        }
        return resultado;
    }
}