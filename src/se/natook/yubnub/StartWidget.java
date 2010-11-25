package se.natook.yubnub;

import se.natook.yubnub.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartWidget extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        final EditText input = (EditText) findViewById(R.id.input);
    


        input.setOnKeyListener(new OnKeyListener() {
        	public boolean onKey(View v, int keycode, KeyEvent ke ){
        		if(keycode == ke.KEYCODE_ENTER) {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://yubnub.org/parser/parse?command="+input.getText()));
                    startActivity(browserIntent);
        			return true;
        		} return false;
        	}
        	
        });
        
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){

            Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://yubnub.org/parser/parse?command="+input.getText()));
            startActivity(browserIntent);

        	}
        	
        });
    
    }
}