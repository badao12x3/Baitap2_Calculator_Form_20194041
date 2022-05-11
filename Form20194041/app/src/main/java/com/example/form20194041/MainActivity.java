package com.example.form20194041;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CheckBox liccense;
    Button submit;
    EditText mssv, cccd, hoten, sdt, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mssv = findViewById(R.id.edit_mssv);
        cccd = findViewById(R.id.edit_cccd);
        hoten = findViewById(R.id.edit_name);
        sdt = findViewById(R.id.edit_sdt);
        email = findViewById(R.id.edit_email);

        findViewById(R.id.btn_birthday).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = Calendar.getInstance().get(Calendar.YEAR);
                int month = Calendar.getInstance().get(Calendar.MONTH);
                int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                DatePickerDialog birthday = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        TextView edit_birthday = (TextView) findViewById(R.id.edit_birthday);
                        edit_birthday.setText((i2+ "/" + (i1+1) +"/" + i));
                    }
                }, year, month, day);
                birthday.show();
            }
        });

        liccense = findViewById(R.id.accept);
        submit = findViewById(R.id.submit);
        submit.setEnabled(false);
        liccense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!liccense.isChecked()) {
                    submit.setEnabled(false);
                }else {
                    submit.setEnabled(true);
                }
            }
        });
        mssv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mssv.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mssv.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!mssv.getText().toString().isEmpty()) mssv.getBackground().setColorFilter(Color.DKGRAY, PorterDuff.Mode.SRC_ATOP);
            }
        });

        cccd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cccd.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cccd.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!cccd.getText().toString().isEmpty()) cccd.getBackground().setColorFilter(Color.DKGRAY, PorterDuff.Mode.SRC_ATOP);
            }
        });

        sdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sdt.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sdt.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!sdt.getText().toString().isEmpty()) sdt.getBackground().setColorFilter(Color.DKGRAY, PorterDuff.Mode.SRC_ATOP);
            }
        });

        hoten.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                hoten.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                hoten.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!hoten.getText().toString().isEmpty()) hoten.getBackground().setColorFilter(Color.DKGRAY, PorterDuff.Mode.SRC_ATOP);
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email.getBackground().setColorFilter(Color.argb(255,3,218,197), PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(!email.getText().toString().isEmpty()) email.getBackground().setColorFilter(Color.DKGRAY, PorterDuff.Mode.SRC_ATOP);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(mssv.getText().toString().isEmpty()){
                    mssv.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    Toast tb1 =  Toast.makeText(MainActivity.this, "Hãy điền MSSV", Toast.LENGTH_SHORT);
                    tb1.show();
                }
                if (cccd.getText().toString().isEmpty()) {
                    cccd.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    Toast cccd_toast =Toast.makeText(MainActivity.this, "Hãy điền số CCCD hoặc CMND", Toast.LENGTH_SHORT);
                    cccd_toast.show();
                }
                if (hoten.getText().toString().isEmpty()) {
                    hoten.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    Toast name_toast =Toast.makeText(MainActivity.this, "Hãy điền Họ và tên", Toast.LENGTH_SHORT);
                    name_toast.show();
                }
                if (sdt.getText().toString().isEmpty()) {
                    sdt.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    Toast sdt_toast =Toast.makeText(MainActivity.this, "Hãy điền số điện thoại", Toast.LENGTH_SHORT);
                    sdt_toast.show();
                }
                if (email.getText().toString().isEmpty()) {
                    email.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    Toast mail_toast = Toast.makeText(MainActivity.this, "Hãy điền địa chỉ email", Toast.LENGTH_SHORT);
                    mail_toast.show();
                }
                else {
                    Toast oke_toast = Toast.makeText(MainActivity.this,"Nộp thành công!!",Toast.LENGTH_SHORT);
                    oke_toast.show();
                }

            }
        });
    }
}