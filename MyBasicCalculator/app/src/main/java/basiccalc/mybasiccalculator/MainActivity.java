package basiccalc.mybasiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btnSubmit;
	private TextView tvResult;
	private EditText etfirst, etsecond, etamount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
		tvResult = (TextView) findViewById(R.id.tvResult);
		etfirst = (EditText) findViewById(R.id.etFirst);
		etsecond = (EditText) findViewById(R.id.etSecond);
		etamount = (EditText) findViewById(R.id.etAmount);
		btnSubmit.setOnClickListener(this);
	}


	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btnSubmit:
			
			if(etfirst.getText().toString().length()==0){
				Toast.makeText(getBaseContext(), "First edittext empty", Toast.LENGTH_LONG).show();
				}
			else if(etsecond.getText().toString().length()==0){
				Toast.makeText(getBaseContext(), "Second edittext empty", Toast.LENGTH_LONG).show();
				}
			else if(etamount.getText().toString().length()==0){
				Toast.makeText(getBaseContext(), "Amount edittext empty", Toast.LENGTH_LONG).show();
				}
			else{
			int divide = (Integer.parseInt(etsecond.getText().toString()) / Integer.parseInt(etfirst.getText().toString())) + 1;
			int multiply = divide * Integer.parseInt(etamount.getText().toString());
			tvResult.setText(String.valueOf(multiply));
			}
			break;
		}
	}

}
