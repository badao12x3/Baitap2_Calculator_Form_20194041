package com.example.calculator20194041;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9;
    Button sum, sub, div, mul, eq, btnc, btnce, btnbs, btnchange;
    TextView mainscr, secscr;
    String  input, input2;
    boolean checkbang = false, checkdau = false;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char EXTRA = '@';
    private final char EQUAL = '=';
    private char ACTION;
    private double num1 = Double.NaN;
    private double num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = (Button) findViewById(R.id.so0);
        btn1 = (Button) findViewById(R.id.so1);
        btn2 = (Button) findViewById(R.id.so2);
        btn3 = (Button) findViewById(R.id.so3);
        btn4 = (Button) findViewById(R.id.so4);
        btn5 = (Button) findViewById(R.id.so5);
        btn6 = (Button) findViewById(R.id.so6);
        btn7 = (Button) findViewById(R.id.so7);
        btn8 = (Button) findViewById(R.id.so8);
        btn9 = (Button) findViewById(R.id.so9);
        btnc = (Button) findViewById(R.id.c);
        btnce = (Button) findViewById(R.id.ce);
        btnbs = (Button) findViewById(R.id.bs);
        sum = (Button) findViewById(R.id.cong);
        sub = (Button) findViewById(R.id.tru);
        div = (Button) findViewById(R.id.chia);
        mul = (Button) findViewById(R.id.nhan);
        eq = (Button) findViewById(R.id.bang);
        mainscr = (TextView) findViewById(R.id.mainscr);
        secscr = (TextView) findViewById(R.id.secscr);
        btnchange = (Button) findViewById(R.id.conghoactru);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkdau ) {
                    input = "";
                    if (secscr.getText().toString().isEmpty()) {
                        if (mainscr.getText().length() > 0) {
                            ACTION = ADD;
                            calc();
                            mainscr.setText(MessageFormat.format("{0} +", num1));
                            secscr.setText(MessageFormat.format("{0} +", (int) num1));
                            mainscr.setText(null);
                        } else {
                            secscr.setText("Error");
                        }
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '/') {
                        ACTION = DIV;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} +", num1));
                        secscr.setText(MessageFormat.format("{0} +", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '-') {
                        ACTION = SUB;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} +", num1));
                        secscr.setText(MessageFormat.format("{0} +", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == 'x') {
                        ACTION = MUL;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} +", num1));
                        secscr.setText(MessageFormat.format("{0} +", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '+') {
                        ACTION = ADD;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} +", num1));
                        secscr.setText(MessageFormat.format("{0} +", num1));
                        mainscr.setText(null);
                    } else {
                        ACTION = ADD;
                        secscr.setText(MessageFormat.format("{0} +", (double) num1));
                    }
                    checkbang = false;
                    checkdau = true;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkdau) {
                    input = "";
                    if (secscr.getText().toString().isEmpty()) {
                        if (mainscr.getText().length() > 0) {
                            ACTION = SUB;
                            calc();
                            mainscr.setText(MessageFormat.format("{0} -", num1));
                            secscr.setText(MessageFormat.format("{0} -", (double) num1));
                            mainscr.setText(null);
                        } else {
                            secscr.setText("Error");
                        }
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '+') {
                        ACTION = ADD;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} -", num1));
                        secscr.setText(MessageFormat.format("{0} -", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '/') {
                        ACTION = DIV;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} -", num1));
                        secscr.setText(MessageFormat.format("{0} -", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == 'x') {
                        ACTION = MUL;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} -", num1));
                        secscr.setText(MessageFormat.format("{0} -", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '-') {
                        ACTION = SUB;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} -", num1));
                        secscr.setText(MessageFormat.format("{0} -", (double) num1));
                        mainscr.setText(null);
                    } else {
                        ACTION = SUB;
                        secscr.setText(MessageFormat.format("{0} -", (double) num1));
                    }
                    checkbang = false;
                    checkdau = true;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkdau) {
                    input = "";
                    if (secscr.getText().toString().isEmpty()) {
                        if (mainscr.getText().length() > 0) {
                            ACTION = DIV;
                            calc();
                            mainscr.setText(MessageFormat.format("{0} /", num1));
                            secscr.setText(MessageFormat.format("{0} /", (double) num1));
                            mainscr.setText(null);
                        } else {
                            secscr.setText("Error");
                        }
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '+') {
                        ACTION = ADD;
                        calc();
                        mainscr.setText(MessageFormat.format("{0}/", num1));
                        secscr.setText(MessageFormat.format("{0}/", (double) num1));
                        mainscr.setText(null);
/*                    if(!isDecimal()){
                        mainscr.setText(MessageFormat.format("{0}/",num1));
                    }else secscr.setText(MessageFormat.format("{0}/",(int)num1));
                    mainscr.setText(null);*/
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '-') {
                        ACTION = SUB;
                        calc();
                        mainscr.setText(MessageFormat.format("{0}/", num1));
                        secscr.setText(MessageFormat.format("{0}/", (double) num1));
                        mainscr.setText(null);
                    /*if(!isDecimal()){
                        mainscr.setText(MessageFormat.format("{0}/",num1));
                    }else secscr.setText(MessageFormat.format("{0}/",(int)num1));
                    mainscr.setText(null);*/
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == 'x') {
                        ACTION = MUL;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} /", num1));
                        secscr.setText(MessageFormat.format("{0} /", (double) num1));
                        mainscr.setText(null);
                    /*if(!isDecimal()){
                        mainscr.setText(MessageFormat.format("{0}/",num1));
                    }else secscr.setText(MessageFormat.format("{0}/",(int)num1));
                    mainscr.setText(null);*/
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '/') {
                        ACTION = DIV;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} /", num1));
                        secscr.setText(MessageFormat.format("{0} /", (double) num1));
                        mainscr.setText(null);
                    /*if(!isDecimal()){
                        mainscr.setText(MessageFormat.format("{0}/",num1));
                    }else secscr.setText(MessageFormat.format("{0}/",(int)num1));
                    mainscr.setText(null);*/
                    } else {
                        ACTION = DIV;
                        secscr.setText(MessageFormat.format("{0} /", (double) num1));
                    }
                    checkbang = false;
                    checkdau = true;
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkdau) {
                    input = "";
                    if (secscr.getText().toString().isEmpty()) {
                        if (mainscr.getText().length() > 0) {
                            ACTION = MUL;
                            calc();
                            mainscr.setText(MessageFormat.format("{0} x", num1));
                            secscr.setText(MessageFormat.format("{0} x", (double) num1));
                            mainscr.setText(null);
                        } else {
                            secscr.setText("Error");
                        }
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '+') {
                        ACTION = ADD;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} x", num1));
                        secscr.setText(MessageFormat.format("{0} x", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '-') {
                        ACTION = SUB;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} x", num1));
                        secscr.setText(MessageFormat.format("{0} x", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == '/') {
                        ACTION = DIV;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} x", num1));
                        secscr.setText(MessageFormat.format("{0} x", (double) num1));
                        mainscr.setText(null);
                    } else if (secscr.getText().charAt(secscr.getText().length() - 1) == 'x') {
                        ACTION = MUL;
                        calc();
                        mainscr.setText(MessageFormat.format("{0} x", num1));
                        secscr.setText(MessageFormat.format("{0} x", (double) num1));
                        mainscr.setText(null);
                    } else {
                        ACTION = MUL;
                        secscr.setText(MessageFormat.format("{0} x", (double) num1));
                    }
                    checkbang = false;
                    Log.v("num1", String.valueOf(num1));
                    Log.v("num2", String.valueOf(num2));
                    checkdau = true;
                }
            }
        });

        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("mainscr",String.valueOf(mainscr.getText().toString().isEmpty()));
                if(!mainscr.getText().toString().isEmpty()){
                    if (!mainscr.getText().toString().equals("0")) {
                        mainscr.setText(MessageFormat.format("{0}", (-1) * Double.parseDouble(mainscr.getText().toString())));
                        Log.v("mainscr","yes");
                    }
                    Log.v("mainscr","yes2");
                }


            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang){
                    input = "";
                    if (secscr.getText().length() > 0) {
                        if (mainscr.getText().length() > 0) {
                            if (secscr.getText().charAt(secscr.getText().length() - 1) == '+') {
                                ACTION = ADD;
                            }
                            if (secscr.getText().charAt(secscr.getText().length() - 1) == '-') {
                                ACTION = SUB;
                            }
                            if (secscr.getText().charAt(secscr.getText().length() - 1) == 'x') {
                                ACTION = MUL;
                            }
                            if (secscr.getText().charAt(secscr.getText().length() - 1) == '/') {
                                ACTION = DIV;
                            }
                            calc();
                            ACTION = EQUAL;
                            mainscr.setText(MessageFormat.format("{0}", num1));
                            secscr.setText(MessageFormat.format("{0}", (Double) num1));
                            mainscr.setText(null);

                        } else {
                            secscr.setText("Error");
                        }
                    } else {
                        if (mainscr.getText().length() > 0)
                            secscr.setText(mainscr.getText().toString());
                    }
                    checkbang = true;
                    checkdau = false;
                }/*else {
                    secscr.setText(MessageFormat.format("{0}x",(double)num1));

                }*/
                Log.v("num1",String.valueOf(num1));
                Log.v("num2",String.valueOf(num2));
            }
        });

    }

/*    private void congtru(){
        if(!mainscr.getText().toString().equals("0")) {
            btnchange.setEnabled(true);
            btnchange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainscr.setText(MessageFormat.format("{0}", (-1) * Double.parseDouble(mainscr.getText().toString())));
                }
            });
        }
    }*/
    private void error(){
        if(secscr.getText().toString().equals("Error")){
            secscr.setText("");
        }
    }

    private  boolean isDecimal(){
        return num1 == (int) num1;
    }

    private void calc(){
        if (!Double.isNaN(num1)){
            if (secscr.getText().toString().charAt(0) == '-'){
                num1 = (-1)* num1;
            }
            num2 = Double.parseDouble(mainscr.getText().toString());

            switch (ACTION){
                case ADD:
                    num1 = num1 + num2;
                    break;
                case SUB:
                    num1 = num1 - num2;
                    break;
                case MUL:
                    num1 = num1 * num2;
                    break;
                case DIV:
                    num1 = num1 / num2;
                    break;
                case EXTRA:
                    num1 = (-1) * num1;
                    break;
                case EQUAL:
                    break;
            }
        }else {
            num1 = Double.parseDouble(mainscr.getText().toString());
        }

    }
/*    public void pheptinh(View view) {

        Button btn = (Button) view;
        String data = btn.getText().toString();
        if(input == null){
            input = "";
        }
        if(data.equals("x")) {
            input += "*";
        }else {

            input+= data;
        }

        mainscr.setText(input);
    }*/

    public void ce(View view) {
        input = "";
        if(mainscr.getText().toString().equals("")) return;
        else mainscr.setText("0");
        return;
    }

    public void bs(View view) {
        if (input == null) mainscr.setText("0");
        else{
            if (input.length() > 0) {
                if(input.length() == 1 || mainscr.getText().toString().equals("0")){
                    input = "";
                    mainscr.setText("0");
                } else {
                    String newText = input.substring(0, input.length() - 1);
                    input = newText;
                    mainscr.setText(input);
                }
            }

        }
    }

    public void num(View view) {
/*        Button btn = (Button) view;
        String data = btn.getText().toString();
        error();
        mainscr.setText(MessageFormat.format("{0}"+data,mainscr.getText().toString()));*/
        error();
        Button btn = (Button) view;
        String data = btn.getText().toString();
        if(input == null){
            input = "";
        }
        switch (data){
            case "0":
                if(mainscr.getText().toString().equals("0")){
                    mainscr.setText("0");
                    break;
                }else{
                    input+= data;
                    mainscr.setText(input);
                    break;
                }
            default:
                input+= data;
                mainscr.setText(input);
                break;
        }
        checkbang = false;
        checkdau = false;
    }


    public void c(View view) {
        num1 = Double.NaN;
        num2 = Double.NaN;
        input = "";
        input2 = "";
        mainscr.setText("0");
        secscr.setText(input2);
    }
}
