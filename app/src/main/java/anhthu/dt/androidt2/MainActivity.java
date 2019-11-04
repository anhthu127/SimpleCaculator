/*
  Đã fix các lỗi:
- Nhập dấu đầu tiên
- Nhập số ngay sau khi nhập dấu "="
- Nhập dấu ngay sau khi nhập dấu "="
- Nhập các dấu liên tục nhau
- Lỗi ở ce
- Lỗi ở rev
 */
package anhthu.dt.androidt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // vấn đề??? Sau khi ấn dấu bằng thì set temp=0 để nó không nối vào kq
    TextView tvResult;
    TextView txtDisplay;


    double op = 0.0;

    double temp = 0;
    double result;
    double before = 0.0, kq = 0.0;
    char c, ch1 = '0', dau = '+';
    int kt = 0, ch2 = 0, count = 1;
    int tan=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.text_result);
        txtDisplay = findViewById(R.id.txt_display);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);

        findViewById(R.id.btn_add).setOnClickListener(this);
        findViewById(R.id.btn_sub).setOnClickListener(this);
        findViewById(R.id.btn_mul).setOnClickListener(this);
        findViewById(R.id.btn_div).setOnClickListener(this);

        findViewById(R.id.btn_equal).setOnClickListener(this);

        findViewById(R.id.btn_rev).setOnClickListener(this);
        findViewById(R.id.btn_bs).setOnClickListener(this);
        findViewById(R.id.btn_ce).setOnClickListener(this);
        findViewById(R.id.btn_c).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_0:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('0');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_1:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('1');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_2:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('2');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_3:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('3');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_4:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    temp = 0.0;
                    ch1 = '0';
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('4');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_5:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('5');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_6:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    temp = 0.0;
                    ch1 = '0';
                    kq = 0.0;
                    dau='+';
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('6');
                tvResult.setText(String.valueOf(op));
                break;
            case R.id.btn_7:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                    dau='+';
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('7');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_8:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                    dau='+';
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('8');
                tvResult.setText(String.valueOf(op));

                break;
            case R.id.btn_9:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    kt = 0;
                    before = 0.0;
                    op = 0;
                    c = '+';
                    ch1 = '0';
                    temp = 0.0;
                    kq = 0.0;
                }
                txtDisplay.setText(txtDisplay.getText().toString());
                selectbtn('9');
                tvResult.setText(String.valueOf(op));
                break;
            case R.id.btn_sub:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    ch1='-';
                    ch2=0;
                    op=0;
                    count=2;
                }else
                selectbtn('-');
                if (count == 4) {
                    tvResult.setText(String.valueOf(before));
                    count = 2;
                }
                Log.d("in btnadd", "onClick:sub " + op);
                if (tan==0) txtDisplay.setText(txtDisplay.getText().toString().concat(String.valueOf(temp) + '-'));
                else
                {
                    txtDisplay.setText(txtDisplay.getText().toString()+'-');
                    tan=0;
                }
                break;
            case R.id.btn_mul:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    ch1='x';
                    ch2=0;
                    op=0;
                    count=2;
                }else
                selectbtn('x');
                if (count == 4) {
                    tvResult.setText(String.valueOf(before));
                    count = 2;
                }
                if (tan==0) txtDisplay.setText(txtDisplay.getText().toString().concat(String.valueOf(temp) + 'x'));
                else
                {
                    txtDisplay.setText(txtDisplay.getText().toString()+"x");
                    tan=0;
                }
                break;
            case R.id.btn_div:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    ch1=':';
                    ch2=0;
                    op=0;
                    count=2;
                }else
                selectbtn(':');
                if (count == 4) {
                    tvResult.setText(String.valueOf(before));
                    count = 2;

                }
                Log.d("in btnadd", "onClick:div " + op);
                if (tan==0) txtDisplay.setText(txtDisplay.getText().toString().concat(String.valueOf(temp) + ':'));
                else
                {
                    txtDisplay.setText(txtDisplay.getText().toString()+':');
                    tan=0;
                }
                break;
            case R.id.btn_add:
                if (ch2 == 1) {
                    txtDisplay.setText("");
                    ch1='+';
                    ch2=0;
                    op=0;
                    count=2;
                }else
                selectbtn('+');
                if (count == 4) {
                    tvResult.setText(String.valueOf(before));
                    count = 2;
                }
                Log.d("in btnadd", "onClick:add " + op);
                if (tan==0) txtDisplay.setText(txtDisplay.getText().toString().concat(String.valueOf(temp) + '+'));
                else {
                    txtDisplay.setText(txtDisplay.getText().toString()+'+');
                    tan=0;
                }
                break;
            case R.id.btn_equal:
                //txtDisplay.setText(txtDisplay.getText().toString().concat(String.valueOf(temp)));

                if (ch2==1)
                {
                 txtDisplay.setText(txtDisplay.getText());
                }
                else {
                    ch2 = 1;
                    kq = process(before, dau, op);
                    before = kq;
                    temp = kq;
                    txtDisplay.setText(txtDisplay.getText().toString() + op + "=" + kq);
                    tvResult.setText(String.valueOf(kq));
                }
                break;
            case R.id.btn_rev:
                selectbtn('b');
                tvResult.setText(String.valueOf(op));
                txtDisplay.setText(txtDisplay.getText().toString());
                break;
            case R.id.btn_bs:
                txtDisplay.setText(txtDisplay.getText().toString() + before);
                break;
            case R.id.btn_ce:
                op=0;
                tvResult.setText(String.valueOf(op));
                break;
            case R.id.btn_c:
                txtDisplay.setText("");
                kt = 0;
                before = 0.0;
                op = 0;
                temp = 0;
                count = 1;
                ch1 = '0';
                kq = 0.0;
                dau='+';
                tvResult.setText("0");
                break;
        }
    }

    public void selectbtn(char c) {
        Log.d("restart", "onCreate: " + op);
        ch2=0;
        if (c < '0' || c > '9') {
            if (c == 'b') {
                op = -op;
            } else if ((ch1 >= '0' && ch1 <= '9')|| (ch1=='b')) {
                if (kt == 1) {
                    before = process(before, dau, op);
              //      txtDisplay.setText(txtDisplay.getText().toString()+op);
                    temp=(double)op;
                    op=0;
                } else {
                    before = (double) op;
                //    txtDisplay.setText(txtDisplay.getText().toString()+op);
                    temp=(double)op;
                    op = 0;
                    kt = 1;
                }
                if (count < 4) count++;
                Log.d("count", "selectbtn: count" + count);
            } else {
                String aaa = txtDisplay.getText().toString();
                txtDisplay.setText(aaa.substring(0, aaa.length() - 1));
                tan=1;
            }
        } else {

            Log.d("tag", "selectbtn: hihi" + c + " " + " " + ch1);
            op = op * 10 + Integer.parseInt(Character.toString(c));
            if (ch1 < '0' || ch1 > '9') {
                dau = ch1;
                if (count < 4) count++;
                Log.d("count", "selectbtn:count " + count);
            }
        }
        ch1 = c;
        Log.d("ch1", "selectbtn: " + ch1);
    }

    public double process(double d, char c, double op) {
        double kq = 0.0;
        switch (c) {
            case ':':
                kq = d / (double) op;
                break;
            case '+':
                kq = d + (double) op;
                break;
            case '-':
                kq = d - (double) op;
                break;
            case 'x':
                kq = d * (double) op;
                break;
            default:
                break;
        }
        return kq;
    }
}