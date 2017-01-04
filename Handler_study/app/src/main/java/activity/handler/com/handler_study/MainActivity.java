package activity.handler.com.handler_study;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private  int img[]={R.mipmap.dou1,R.mipmap.dou2,R.mipmap.dou3,R.mipmap.dou4};
    private TextView textView;
    private ImageView imageView;
    private  int  index;
    private Handler handler=new Handler();
    MyRunnable myrunanble=new MyRunnable();
   class  MyRunnable implements  Runnable{
       @Override
       public void run() {
           index++;
           index=index%3;
           imageView.setImageResource(img[index]);
           handler.postDelayed(myrunanble,2000);

       }
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       imageView=(ImageView)  findViewById(R.id.imageView);
       textView=(TextView) findViewById(R.id.textview);
        handler.postDelayed(myrunanble,1000);
     handler.post(new Runnable() {
         @Override
         public void run() {
           textView.setText("你好我是runnable");
         }
     });

    }
}
