package manojvictormathew.sysinfo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SysinfoActivity extends Activity {
    private OnClickListener buttoListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			EditText editText = (EditText) findViewById(R.id.editText1);
			Log.d( "Sysinfo", editText.getText().toString());
			
		}
	}; 

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView mainView = (TextView) findViewById(R.id.SysinfoActivityTextView);
        mainView.setText(R.string.test_updating_a_view);
        
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(buttoListener);
        
        
    }
}